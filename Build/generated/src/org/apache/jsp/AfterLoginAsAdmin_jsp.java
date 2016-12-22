package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AfterLoginAsAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AdminLoggedIn</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/owl.transitions.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\">        \n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("       <!-- <form action=\"MovieServlet\" method=\"POST\">\n");
      out.write("           // MovieId:<input type=\"text\" name=\"movieid\" value=\"\" /><br><br>\n");
      out.write("           // Title:<input type=\"text\" name=\"title\" value=\"\" /><br><br>\n");
      out.write("           // Year<input type=\"text\" name=\"year\" value=\"\" /><br><br>\n");
      out.write("           // Duration<input type=\"text\" name=\"duration\" value=\"\" /><br><br>\n");
      out.write("           // Actor<input type=\"text\" name=\"actor\" value=\"\" /><br><br>\n");
      out.write("            //Director<input type=\"text\" name=\"director\" value=\"\" /><br><br>\n");
      out.write("           // Genre<input type=\"text\" name=\"genre\" value=\"\" /><br><br>\n");
      out.write("            Synopsis<input type=\"text\" name=\"synopsis\" value=\"\" /><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Add Movie\" name=\"addmovie\" />&nbsp;&nbsp;<input type=\"submit\" name = \"viewmovies\" value=\"View Products\"/> \n");
      out.write("        -->    \n");
      out.write("<body>\n");
      out.write("        <form class=\"form-horizontal\" action=\"MovieServlet\" method=\"post\">        \n");
      out.write("            <div class=\"section-header\">\n");
      out.write("                <p class=\"section-title text-center wow fadeInDown\">Hello Admin :)</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" >                \n");
      out.write("                <div class='col-md-6 well' style=\"left:25%;height: 200%;\">\t\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-md-3 control-label\"><h4>MovieId</h4></label>\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <input type=\"text\" name=\"movieid\" class=\"form-control\" title = 'select your user name'>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-md-3 control-label\"><h4>Title</h4></label>\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <input type=\"text\" name=\"title\" class=\"form-control\" title = 'select your password'>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-md-3 control-label\"><h4>Year</h4></label>\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <input type=\"text\" name=\"year\" class=\"form-control\" title = 'select your password'>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-md-3 control-label\"><h4>Duration</h4></label>\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <input type=\"text\" name=\"duration\" class=\"form-control\" title = 'select your password'>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-md-3 control-label\"><h4>Actor</h4></label>\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <input type=\"text\" name=\"actor\" class=\"form-control\" title = 'select your password'>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-md-3 control-label\"><h4>Director</h4></label>\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <input type=\"text\" name=\"director\" class=\"form-control\" title = 'select your password'>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-md-3 control-label\"><h4>Genre</h4></label>\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <input type=\"text\" name=\"genre\" class=\"form-control\" title = 'select your password'>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-md-3 control-label\"><h4>Synopsis</h4></label>\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <input type=\"text\" name=\"synopsis\" class=\"form-control\" title = 'select your password'>\n");
      out.write("        </div>\n");
      out.write("    </div>    \n");
      out.write("\t<div class='col-md-offset-3'>\n");
      out.write("        <input type=\"submit\" name=\"addmovie\" value=\"Add Movie\" class=\"btn btn-primary btn-lg\"/>&nbsp;&nbsp;<input type=\"submit\" name=\"viewmovies\" value=\"View Movies\" class=\"btn btn-primary btn-lg\"/>       \n");
      out.write("\t</div>           \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("            <b> <a href=\"index.jsp\">Logout</a></b>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
