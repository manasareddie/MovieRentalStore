<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdminLoggedIn</title>
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
    
    </head>
    
       <!-- <form action="MovieServlet" method="POST">
           // MovieId:<input type="text" name="movieid" value="" /><br><br>
           // Title:<input type="text" name="title" value="" /><br><br>
           // Year<input type="text" name="year" value="" /><br><br>
           // Duration<input type="text" name="duration" value="" /><br><br>
           // Actor<input type="text" name="actor" value="" /><br><br>
            //Director<input type="text" name="director" value="" /><br><br>
           // Genre<input type="text" name="genre" value="" /><br><br>
            Synopsis<input type="text" name="synopsis" value="" /><br><br>
            <input type="submit" value="Add Movie" name="addmovie" />&nbsp;&nbsp;<input type="submit" name = "viewmovies" value="View Products"/> 
        -->    
<body>
        <form class="form-horizontal" action="MovieServlet" method="post">        
            <div class="section-header">
                <p class="section-title text-center wow fadeInDown">Hello Admin :)</p>
            </div>
            <div class="container" >                
                <div class='col-md-6 well' style="left:25%;height: 200%;">	
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>MovieId</h4></label>
        <div class="col-md-8">
            <input type="text" name="movieid" class="form-control" title = 'select your user name'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Title</h4></label>
        <div class="col-md-8">
            <input type="text" name="title" class="form-control" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Year</h4></label>
        <div class="col-md-8">
            <input type="text" name="year" class="form-control" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Duration</h4></label>
        <div class="col-md-8">
            <input type="text" name="duration" class="form-control" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Actor</h4></label>
        <div class="col-md-8">
            <input type="text" name="actor" class="form-control" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Director</h4></label>
        <div class="col-md-8">
            <input type="text" name="director" class="form-control" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Genre</h4></label>
        <div class="col-md-8">
            <input type="text" name="genre" class="form-control" title = 'select your password'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Synopsis</h4></label>
        <div class="col-md-8">
            <input type="text" name="synopsis" class="form-control" title = 'select your password'>
        </div>
    </div>    
	<div class='col-md-offset-3'>
        <input type="submit" name="addmovie" value="Add Movie" class="btn btn-primary btn-lg"/>&nbsp;&nbsp;<input type="submit" name="viewmovies" value="View Movies" class="btn btn-primary btn-lg"/>       
	</div>           
</div>
</div>
            <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
</form>
</body>
</html>