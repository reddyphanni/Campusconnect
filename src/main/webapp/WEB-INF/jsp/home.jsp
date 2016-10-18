<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html data-ng-app="myapp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

 <script type="text/javascript" src="https://opensource.keycdn.com/angularjs/1.5.8/angular.min.js "></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/user.js"></script>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet"/>
</head>
<div class="container">
	<div class="row">
		
	</div>
</div>
<br>
<br>
<div class="container">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="form-body">
    <ul class="nav nav-tabs final-login">
        <li class="active"><a data-toggle="tab" href="#sectionA">Sign In</a></li>
        <li><a data-toggle="tab" href="#sectionB">Join us!</a></li>
    </ul>
    <div class="tab-content">
        <div id="sectionA" class="tab-pane fade in active">
        <div class="innter-form">
            <form action="perform_login"  class="sa-innate-form" method="post">
            <label>Username</label>
            <input type="text" name="username">
            <label>Password</label>
            <input type="password" name="password">
            <button type="submit">Sign In</button>
            <a href="">Forgot Password?</a>
            </form>
            </div>
            <!-- <div class="social-login">
            <p>- - - - - - - - - - - - - Sign In With - - - - - - - - - - - - - </p>
    		<ul>
            <li><a href="www.facebook.com"><i class="fa fa-facebook"></i> Facebook</a></li>
            <li><a href="www.google+.com"><i class="fa fa-google-plus"></i> Google+</a></li>
            <li><a href="www.twitter.com"><i class="fa fa-twitter"></i> Twitter</a></li>
            </ul>
            </div> -->
            <div class="clearfix"></div>
        </div>
        <div id="sectionB" class="tab-pane fade">
			<div class="innter-form">
            <form data-ng-controller="Usercontroller"  data-ng-submit="submit()"   class="sa-innate-form" method="post">
            <label>Name</label>
            <input type="text" class="form-control" data-ng-model="name">
            <label>username</label>
            <input type="text"class="form-control"  data-ng-model="username">
            <label>Email Address</label>
            <input type="email" class="form-control" data-ng-model="email">
            <label>Password</label>
            <input type="password" class="form-control" data-ng-model="password">
            <label>Mobile</label>
            <input type="text" class="form-control" data-ng-model="usermobile">
            
            <button type="submit">Join now</button>
            <p>By clicking Join now, you agree to hifriends's User Agreement, Privacy Policy, and Cookie Policy.</p>
            </form>
            </div>
            <div class="social-login">
            <p>- - - - - - - - - - - - - Register With - - - - - - - - - - - - - </p>
			<ul>
            <li><a href="www.facebook.com"><i class="fa fa-facebook"></i> Facebook</a></li>
            <li><a href="www.google+.com"><i class="fa fa-google-plus"></i> Google+</a></li>
            <li><a href="www.twitter.com"><i class="fa fa-twitter"></i> Twitter</a></li>
            </ul>
            </div>
        </div>
    </div>
    </div>
    </div>
    </div>
    </div>
