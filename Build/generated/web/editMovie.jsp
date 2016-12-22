<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.transitions.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">        
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    
        <title>EditMovie</title>
    </head>
    <body>
        
        
  
  <form class="form-horizontal" action="MovieServlet" method="post">
        
            <div class="section-header">
                <p class="section-title text-center wow fadeInDown">edit movie</p>
            </div>
            <div class="container" >
                
                <div class='col-md-6 well' style="left:25%;height: 200%;">	    
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Title</h4></label>
        <div class="col-md-8">
            <input type="text" name="title" class="form-control" value="${movie.title}" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Year</h4></label>
        <div class="col-md-8">
            <input type="text" name="year" class="form-control" value="${movie.year}" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Duration</h4></label>
        <div class="col-md-8">
            <input type="text" name="duration" class="form-control" value="${movie.duration}" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Actor</h4></label>
        <div class="col-md-8">
            <input type="text" name="actor" class="form-control" value="${movie.actor}" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Director</h4></label>
        <div class="col-md-8">
            <input type="text" name="director" class="form-control" value="${movie.director}" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Genre</h4></label>
        <div class="col-md-8">
            <input type="text" name="genre" class="form-control" value="${movie.genre}" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Synopsis</h4></label>
        <div class="col-md-8">
            <input type="text" name="synopsis" class="form-control" value="${movie.synopsis}" title = 'select your password'>
        </div>
    </div>
    
	<div class='col-md-offset-3'>
        <input type="submit" name="UpdateExist" value="Update Movie" class="btn btn-primary btn-lg"/>
       
	</div>
           

</div>
</div>          
</form>
        <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
</body>
</html>