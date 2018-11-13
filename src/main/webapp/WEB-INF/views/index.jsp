<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-ML9h/UCooefre72ZPxxOHyjbrLT1xKV0AHON1J+OlOV2iwcYemqmWyMfTcfyzLJ1"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet">
<title>Coffee Shop Lab</title>
</head>
<body>
	${firstPage}
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="/">The BeanBar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="/">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="registration">Registration</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">About</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" placeholder="Search" type="text">
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<br>
	<br>

	<div class="background"></div>

	<br>
	<br>
	<div class="livespace">
		<h1>
			Grounds for a second <br> shot at a productivity
		</h1>
		<br>
		<br>
		<ol>
			<li><a href="orderOnline">Order Online</a></li><br>
			<li><a href="logIn">Log Into Account</a></li><br>
			<li><a href="map">Find a Location</a></li><br>
		</ol>
	</div>

	<!-- <img src="images/double-shot2.jpg" class="baseimg"> -->
	<div class="footer"></div>
<script src="script.js"></script>
</body>
</html>