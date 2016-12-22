<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>DisplayRentals</title>
    </head>
       <body>
           <div class="container">
        <h3>Movies rented by ${uemail}</h3>       
       <form action="MovieServlet" method="post">
            <c:set var="rentals" value="${rentals}" scope="session"/>
            <table class="table">
                <tr>
                    
                    <th>MovieId</th>
                    <th>Title</th>
                    <th>CreditCardDetails</th>
                    <th>email</th>
                    <th></th>                    
                </tr>
                
                <c:forEach var="rental" items="${rentals}" >
                    <tr>                       
                        <td>${rental.getmovieId()}</td>
                        <td>${rental.title}</td>
                        <td>${rental.getccNum()}</td>
                        <td>${rental.getuemail()}</td>  
                        <td><a href="DownloadServlet">click to download</a></td>
                    </tr> 
                </c:forEach>
                <!-- Hint! Remember to code for the 'Edit' and 'Delete' links -->  
            </table>
            </form>
            <br>
            <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
        <!-- Hint! You need to code a form for the 'Add Product' button -->
           </div>
    </body>
</html>
