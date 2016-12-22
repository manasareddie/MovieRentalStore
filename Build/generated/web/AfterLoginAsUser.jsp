<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>UserLoginIn</title>
    </head>
    <body>
        <div class="container">
          <h3>  <i> Logged in as ${username}</i> </h3>    
        <form name="user" action="MovieServlet" method="post">
            <blockquote>
                <a href="MovieServlet?action=viewmoviesbyuser&amp;uemail=${username}">View Movies</a><br>             
                <a href="MovieServlet?action=showrentals&amp;uemail=${username}">View History</a><br>
                <a href="MovieServlet?action=editprofile&amp;uemail=${username}">Edit Profile</a><br>
            <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
            </blockquote>
        </form>
        </div>
    </body>
</html>
