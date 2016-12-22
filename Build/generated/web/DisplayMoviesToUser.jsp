<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DisplayMoviesToUser</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    
    <body>        
         <div class="container" >
             <h3>  <i> Logged in as ${username}</i> </h3>    
        <form action="MovieServlet" method="post">
            <c:set var="movieList" value="${movieList}" scope="session"/>
            <table class="table">
                <tr>
                    <th>MovieId</th>
                    <th>Title</th>
                    <th>Year</th>
                    <th>Duration</th>
                    <th>Actor</th>
                    <th>Director</th>
                    <th>Genre</th>
                    <th>Synopsis</th>                    
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach var="movie" items="${movieList}" >
                    <tr>
                        <td>${movie.movieId}</td>
                        <td>${movie.title}</td>
                        <td>${movie.year}</td>
                        <td>${movie.duration}</td>
                        <td>${movie.actor}</td>
                        <td>${movie.director}</td>
                        <td>${movie.genre}</td>
                        <td>${movie.synopsis}</td>
                        <td><a href="MovieServlet?action=rentmovie&amp;movieId=${movie.movieId}&amp;uemail=${username}">Rent</a></td>
                        
                    </tr> 
                </c:forEach>
                <!-- Hint! Remember to code for the 'Edit' and 'Delete' links -->  
            </table>
           <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
        </form>
         </div>
        <!-- Hint! You need to code a form for the 'Add Product' button -->
    </body>
</html>
