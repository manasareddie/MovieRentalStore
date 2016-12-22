/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import movie.business.*;

public class MovieDB {
    private static List<Customer> customers = null;
    private static List<Admin> admin = null;
    private static List<Movie> movie=null;
    private static List<Rental> rental=null;
     public static ArrayList<Customer> selectCustomers()
    {
        
        System.out.println("In the select Products methods!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        ArrayList<Customer> customers = new ArrayList();
        try{
  Class.forName("com.mysql.jdbc.Driver");
   String dbURL = "jdbc:mysql://localhost:3306/nbad";
            String username = "root";
            String password = "sesame";
            Connection c = DriverManager.getConnection( dbURL, username,password);
            Statement s = c.createStatement();
            String sql="select * from Customer1";
            System.out.print("after select");
             ResultSet productsResSet;
            productsResSet = s.executeQuery(sql);
              
            if (productsResSet != null) 
            {
                                while (productsResSet.next()) 
                                {
                    Customer cust = new Customer();
                    cust.setmembershipid(productsResSet.getInt(1));
                    cust.setfname(productsResSet.getString(2));
                    cust.setmname(productsResSet.getString(3));
                    cust.setlname(productsResSet.getString(4));
                    cust.setAddressLine1(productsResSet.getString(5));
                    cust.setcity(productsResSet.getString(6));
                    cust.setstate(productsResSet.getString(7));
                    cust.setzipcode(productsResSet.getString(8));
                    cust.setemail(productsResSet.getString(9));
                    cust.setpassword(productsResSet.getString(10));
                    cust.setccnum(productsResSet.getString(11));
                    //cust.setccexpiry(productsResSet.getDate(12));
                    cust.setcvv(productsResSet.getString(12));
                    
                    customers.add(cust);
                } 
                                return customers;
            } 
        
            else {
                System.out.println("in else");
                  return customers;
            }                      
           
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("in catch"+e);
        }
return customers;

}
     
     public static Customer selectCustomer(String username, String password) {
        customers = selectCustomers();
        for (Customer p : customers) {
            if (username != null
                    && username.equalsIgnoreCase(p.getemail()) && password!=null && password.equals(p.getpassword())) {
                return p;
            }
        }
        return null;
    }
     public static Customer selectCustomer(String email) {
        customers = selectCustomers();
        for (Customer p : customers) {
            if (email != null
                    && email.equalsIgnoreCase(p.getemail())) {
                return p;
            }
        }
        return null;
    }
     
     public static List<Admin> selectAdmins()
     {
         admin = new ArrayList();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rslt = null;
        String query = "SELECT * FROM InventoryManager";
        try {
            ps = connection.prepareStatement(query);
            rslt = ps.executeQuery();
            while (rslt.next()) {
                String Username = rslt.getString("username");                
                String Password = rslt.getString("password");
                
                Admin p = new Admin();
                p.setaname(Username);
                p.setapassword(Password);
                              
                admin.add(p);
            }
            return admin;
        } 
        catch (SQLException e) {
            System.out.println(e);
            return null;
        } 
        finally {
            pool.freeConnection(connection);        
        }                      
     }
      public static Admin selectAdmin(String uname, String password) {
        admin = selectAdmins();
        for (Admin p : admin) {
            if (p != null
                    && uname.equals(p.getaname()) && password.equals(p.getapassword())) {
                return p;
            }
        }
        return null;
    }
     
      public static List<Movie> selectMovies() {
        movie = new ArrayList();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rslt = null;
        String query = "SELECT * FROM Movie1";
        try {
            ps = connection.prepareStatement(query);
            rslt = ps.executeQuery();
            while (rslt.next()) {
                String Movieid = rslt.getString("movie_id");
                String Title=rslt.getString("title");
                String Year = rslt.getString("year");
                String Duration = rslt.getString("duration");
                String Actor = rslt.getString("actor");
                String Director=rslt.getString("director");
                String Genre=rslt.getString("genre");
                String Synopsis=rslt.getString("synopsis");
           
                Movie m = new Movie();
               m.setmovieId(Movieid);
               m.settitle(Title);
               m.setyear(Year);
               m.setduration(Duration);
               m.setactor(Actor);
               m.setdirector(Director);
               m.setgenre(Genre);
               m.setsynopsis(Synopsis);
               
                movie.add(m);
            }
            return movie;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            pool.freeConnection(connection);
        }
    }
public static Movie selectMovie(String movieId) {
        movie = selectMovies();
        for (Movie p : movie) {
            if (movieId != null
                    && movieId.equalsIgnoreCase(p.getmovieId())) {
                return p;
            }
        }
        return null;
}
  public static void updateMovie(Movie m) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;              
        String query = "UPDATE Movie1 SET title = ?, year=?, duration=?, actor=?, director=?, genre=?, synopsis=?  WHERE movie_id= ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, m.gettitle());
            ps.setString(2, m.getyear());
            ps.setString(3, m.getduration());
            ps.setString(4, m.getactor());
            ps.setString(5, m.getdirector());
            ps.setString(6, m.getgenre());
            ps.setString(7, m.getsynopsis());
            ps.setString(8, m.getmovieId());            
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            pool.freeConnection(connection);
        }
    }
   public static void editCustomerProfile(Customer c) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;              
        String query = "UPDATE Customer1 SET first_name = ?,middle_name=?,last_name=?,address=?,city=?,state=?,zip_code=?,password=?,cc_num=?,cc_cvv=?  WHERE email= ?";
        try {
 
            ps = connection.prepareStatement(query);
            ps.setString(1, c.getfname());
            ps.setString(2, c.getmname());
            ps.setString(3, c.getlname());
            ps.setString(4, c.getAddressLine1());
            ps.setString(5, c.getcity());
            ps.setString(6, c.getstate());
            ps.setString(7, c.getzipcode());
            ps.setString(8, c.getpassword());
            ps.setString(9, c.getccnum());
            ps.setString(10, c.getcvv());
            ps.setString(11, c.getemail());
                       
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            pool.freeConnection(connection);
        }
    }
   public static void deleteMovie(Movie movie) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
             
        String query = "DELETE from Movie1 WHERE movie_id= ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, movie.getmovieId());
            ps.executeUpdate();
        } catch (SQLException e) {
            pool.freeConnection(connection);
        }
    }

     public static void insertCustomer(Customer customer) {        
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String query = "INSERT INTO Customer1 (first_name, middle_name, last_name, address, city, state, zip_code, email, password, cc_num, cc_cvv) "
          + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            System.out.println("movie.data.MovieDB.insertCustomer()");
            ps = connection.prepareStatement(query);
           // ps.setInt(1, customer.getmembershipid());
            ps.setString(1, customer.getfname());
            ps.setString(2, customer.getmname());
            ps.setString(3, customer.getlname());
            ps.setString(4, customer.getAddressLine1());
            ps.setString(5, customer.getcity());
            ps.setString(6, customer.getstate());
         // ps.setString(8, null);
            ps.setString(7, customer.getzipcode());
            ps.setString(8, customer.getemail());
            ps.setString(9, customer.getpassword());
            ps.setString(10, customer.getccnum());
            ps.setString(11, customer.getcvv());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            pool.freeConnection(connection);
        }
    }
     public static void insertMovie(Movie m) {        
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String query = "INSERT INTO Movie1 (movie_id,title,year,duration,actor,director,genre,synopsis) "
          + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {            
            ps = connection.prepareStatement(query);
            ps.setString(1, m.getmovieId());
            ps.setString(2, m.gettitle());
            ps.setString(3, m.getyear());
            ps.setString(4, m.getduration());
            ps.setString(5, m.getactor());
            ps.setString(6, m.getdirector());
            ps.setString(7, m.getgenre());         
            ps.setString(8, m.getsynopsis());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            pool.freeConnection(connection);
        }
    }
     public static void insertIntoRental(String id, String uemail) {        
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rslt = null;
        int membershipID=0;
        String ccNumber = "";
        String title="";
        String query = "SELECT * FROM Customer1 WHERE email=?";
        try {            
            ps = connection.prepareStatement(query);
            ps.setString(1, uemail);                        
            rslt=ps.executeQuery();
            while (rslt.next()) {
                membershipID = rslt.getInt("membership_id");
                ccNumber=rslt.getString("cc_num");
                ps = null;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
        String query2 = "SELECT * FROM Movie1 WHERE movie_id=?";
        try {            
            ps = connection.prepareStatement(query2);
            ps.setString(1, id);                        
            rslt=ps.executeQuery();
            while (rslt.next()) {
                title = rslt.getString("title");                
                ps = null;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        String query3 = "INSERT INTO Rental (membership_id,movie_id,title,email,cc_num) values (?,?,?,?,?)";
        try {            
            ps = connection.prepareStatement(query3);
            ps.setInt(1, membershipID); 
            ps.setString(2, id); 
            ps.setString(3,title);
            ps.setString(4,uemail);
            ps.setString(5,ccNumber);
            ps.executeUpdate();           
        } catch (SQLException e) {
            System.out.println(e);
        }                
        finally {
            pool.freeConnection(connection);
        }
    }
      public static List<Rental> selectRentals(String uemail) {  
          rental=new ArrayList();           
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rslt = null;
        String query = "SELECT * FROM Rental WHERE email=?";
        try {            
            ps = connection.prepareStatement(query);
            ps.setString(1, uemail);                        
            rslt=ps.executeQuery();
             while (rslt.next()) {
                int userid = rslt.getInt("membership_id");
                String movieId=rslt.getString("movie_id");
                String title = rslt.getString("title");
                String ccNumber = rslt.getString("cc_num");                
                Rental r=new Rental();
                
                r.setmembershipId(userid);
                r.setmovieId(movieId);
                r.settitle(title);
                r.setccNum(ccNumber);
                r.setuemail(uemail);                             
                rental.add(r);  
                 System.out.println("manasamjsdfhdjsh");
        } 
             return rental; 
        }catch (SQLException e) {
            
            System.out.println("manasa reddy karra");
            return null;
        } finally {
            pool.freeConnection(connection);
        }
    }
}

