<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>MailConfirmation</title>
    </head>
    <body class="container"><br><br>
        <blockquote>
        <h3>Movie Rented!!</h3>
        <form action="EmailServlet" method="post">
         
         <label class="pad_top">Email:</label>
         <input type="email" name="email"><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="send confirmation" class="">
        
         </form>
        </blockquote>
       <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
    </body>
</html>
