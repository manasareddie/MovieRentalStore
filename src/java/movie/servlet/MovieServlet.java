/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import movie.business.*;
import movie.data.*;

public class MovieServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MovieServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MovieServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String action = request.getParameter("action");
        String url = null;
        if (action == null) {
            action = "add";
            url = "/product.jsp";
        }
        if (action.equals("edit")) {
            String id = request.getParameter("movieId");
            Movie movie = MovieDB.selectMovie(id);            
            request.setAttribute("movie", movie);
            url = "/editMovie.jsp";
        }
      if (action.equals("delete")) {
            String id = request.getParameter("movieId");
            Movie movie = MovieDB.selectMovie(id);
            request.setAttribute("movie", movie);
            url = "/confirmDelete.jsp";
        }
      if (action.equals("viewmoviesbyuser")) {
            String id = request.getParameter("uemail");
            List<Movie> movieList = MovieDB.selectMovies();
            request.setAttribute("movieList", movieList);
            request.setAttribute("username", id);
            url = "/DisplayMoviesToUser.jsp";
        }
      if(action.equals("editprofile"))
      {
          String email=request.getParameter("uemail");
          Customer cust=MovieDB.selectCustomer(email);
          request.setAttribute("cust",cust);     
          url="/editProfile.jsp";
      }
      if(action.equals("rentmovie")){
          String id=request.getParameter("movieId");
          String uemail=request.getParameter("uemail");
          System.out.println("--------------");
          MovieDB.insertIntoRental(id,uemail);
          List<Rental> rentals= MovieDB.selectRentals(uemail);
          request.setAttribute("rentals",rentals);
          request.setAttribute("uemail", uemail);      
          url="/MailConfirmation.jsp";          
      }
      if(action.equals("showrentals"))    {
          String email=request.getParameter("uemail");
           List<Rental> rentals= MovieDB.selectRentals(email);
           request.setAttribute("rentals", rentals);
           request.setAttribute("uemail", email);      
           url="/DisplayRentals.jsp";
      }
      
     
    getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = null;
        if (request.getParameter("register") != null) {
            String Fname = request.getParameter("fname");
            String Mname = request.getParameter("mname");
            String Lname = request.getParameter("lname");
            String Address = request.getParameter("address");
            String City = request.getParameter("city");
            String State = request.getParameter("state");
            String Zipcode = request.getParameter("zipcode");
            String Email = request.getParameter("email");
            String Password = request.getParameter("password");
            String Ccnum = request.getParameter("ccnum");            
            String Cvv = request.getParameter("cvv");            
           
            Customer cust = new Customer();
            cust.setmembershipid(50);
            cust.setfname(Fname);
            cust.setmname(Mname);
            cust.setlname(Lname);
            cust.setAddressLine1(Address);
            cust.setcity(City);
            cust.setstate(State);
            cust.setzipcode(Zipcode);
            cust.setemail(Email);
            cust.setpassword(Password);
            cust.setccnum(Ccnum);            
            cust.setcvv(Cvv);                                                             
            MovieDB.insertCustomer(cust);            
            url = "/AfterRegister.jsp";                              
        }
        if (request.getParameter("addmovie") != null) {
            String Movieid = request.getParameter("movieid");
            String Title = request.getParameter("title");
            String Year = request.getParameter("year");
            String Duration = request.getParameter("duration");
            String Actor = request.getParameter("actor");
            String Director = request.getParameter("director");
            String Genre = request.getParameter("genre");
            String Synopsis = request.getParameter("synopsis");
            
            Movie m = new Movie();
           m.setmovieId(Movieid);
            m.settitle(Title);
            m.setyear(Year);
            m.setduration(Duration);
            m.setactor(Actor);
            m.setdirector(Director);
            m.setgenre(Genre);
            m.setsynopsis(Synopsis);
                                                                    
            MovieDB.insertMovie(m);
             //   List<Customer> customerList = MovieDB.selectCustomers();
               // request.setAttribute("customerlist", customerList);
            url = "/AfterLoginAsAdmin.jsp";                              
        }
        
        if(request.getParameter("login")!=null)
        {
            String Email=request.getParameter("username");
            String Password=request.getParameter("password");
            Customer c= MovieDB.selectCustomer(Email, Password);
            if(c!=null)
            {
                request.setAttribute("username", Email);
                url="/AfterLoginAsUser.jsp";
            }
            else
                url="/index.jsp";
        }
        if(request.getParameter("adminlogin")!=null)
        {
            String Name=request.getParameter("adminname");
            String Password=request.getParameter("adminpassword");
            Admin a= MovieDB.selectAdmin(Name, Password);
            if(a!=null)
                url="/AfterLoginAsAdmin.jsp";
            else
                url="/index.jsp";
        }
        if (request.getParameter("viewmovies")!=null) {
            List<Movie> movieList = MovieDB.selectMovies();
            request.setAttribute("movieList", movieList);
            url = "/movies.jsp";
        }
        if (request.getParameter("viewmoviesbyuser")!=null) {
            List<Movie> movieList = MovieDB.selectMovies();
            request.setAttribute("movieList", movieList);
            url = "/DisplayMoviesToUser.jsp";
        }
          if (request.getParameter("UpdateExist") != null) {
            String title = request.getParameter("title");
            String year = request.getParameter("year");
            String duration = request.getParameter("duration");
            String actor = request.getParameter("actor");
            String director = request.getParameter("director");
            String genre = request.getParameter("genre");
            String synopsis = request.getParameter("synopsis");
            
            Movie m = new Movie();            
            m.settitle(title);
            m.setyear(year);
            m.setduration(duration);
            m.setactor(actor);
            m.setdirector(director);
            m.setgenre(genre);
            m.setsynopsis(synopsis);
            
            MovieDB.updateMovie(m);
            List<Movie> movieList = MovieDB.selectMovies();
            request.setAttribute("movieList", movieList);
            url = "/movies.jsp";
        }
          if(request.getParameter("UpdateCustomer")!=null)
          {
            String Fname = request.getParameter("fname");
            String Mname = request.getParameter("mname");
            String Lname = request.getParameter("lname");
            String Address = request.getParameter("address");
            String City = request.getParameter("city");
            String State = request.getParameter("state");
            String Zipcode = request.getParameter("zipcode");
            //String Email = request.getParameter("email");
            String Password = request.getParameter("password");
            String Ccnum = request.getParameter("ccnum");            
            String Cvv = request.getParameter("cvv");            
           
            Customer cust = new Customer();
            //cust.setmembershipid(50);
            cust.setfname(Fname);
            cust.setmname(Mname);
            cust.setlname(Lname);
            cust.setAddressLine1(Address);
            cust.setcity(City);
            cust.setstate(State);
            cust.setzipcode(Zipcode);
            //cust.setemail(Email);
            cust.setpassword(Password);
            cust.setccnum(Ccnum);
            
            cust.setcvv(Cvv);                                                             
            MovieDB.editCustomerProfile(cust);
            request.setAttribute("cust",cust);
            url="/afterProfileEdit.jsp";
          }

        if (request.getParameter("Yes") != null) {
            String code = request.getParameter("movieId");
            Movie m = MovieDB.selectMovie(code);
            MovieDB.deleteMovie(m);
            List<Movie> movieList = MovieDB.selectMovies();
            request.setAttribute("movieList", movieList);
            url = "/movies.jsp";
        }

        if (request.getParameter("No") != null) {
            List<Movie> movieList = MovieDB.selectMovies();
            request.setAttribute("movieList", movieList);
            url = "/movies.jsp";
        }
       

     
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}