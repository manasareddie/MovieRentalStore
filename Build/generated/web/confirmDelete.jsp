<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>Conform Delete</title>
    </head>
    <body>
          <div class="container" >
 <form action="MovieServlet" method="post"> 
        <h3> Delete this product?</h3>
        <blockquote>
        <label>Title: ${movie.title}</label><br>
        <label>Year: ${movie.year}</label><br>
        <label>Duration: ${movie.duration}</label><br>
        <label>Actor: ${movie.actor}</label><br>
        <label>Director: ${movie.director}</label><br>
        <label>Genre: ${movie.genre}</label><br>
        <label>Synopsis: ${movie.synopsis}</label><br>
        
        </blockquote>
        <input type="submit" name = "Yes" value="Yes" class="btn btn-primary btn-sm"/><input type="hidden" name = "movieId" value="${movie.movieId}">&nbsp;&nbsp;
        <input type="submit" name = "No" value="No" class="btn btn-primary btn-sm"/> 
        
        </form>
          </div>
       <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
    </body>
</html>
