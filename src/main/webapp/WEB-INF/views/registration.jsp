<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-ML9h/UCooefre72ZPxxOHyjbrLT1xKV0AHON1J+OlOV2iwcYemqmWyMfTcfyzLJ1" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<link href="style.css" rel="stylesheet">
<title>Registration</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="/">The BeanBar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="registration">Registration<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About</a>
      </li>
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
		<div class="container">
		<div class="row">
		<div class="col-9">

<h4>Welcome to the Registration Page!</h4>
<h5>Please complete the following form:</h5>

<form action="addperson" onsubmit="return validateInfo();" method="post">
First Name: <input id="firstname" type="text" name="fName">  <br><br>
Last Name: <input id="lastname" type="text" name="lName"> <br><br>
Email: <input id="email" type="email" name="email"> <br><br>
Password: <input id="pw" type="password" name="pw">  <br><br>
Confirm Password: <input id="confirm" type="password" name="password"> <br><br>
Primary Phone: <input id="phone" type="text" name="phone" pattern="[1-9]{3}-[1-9]{3}-[1-9]{4}" title="XXX-XXX-XXXX">  <br><br>
Birthdate: <input id="bday" type="date" name="DOB" pattern="[1-12]{2}-[1-31]{2}-[1-1920]{4}" title="MM-DD-YYYY"> <br><br>
Coffee Preferences: <br>
<input type="checkbox" name="coffee" value="Decaf"> Decaf <br>
<input type="checkbox" name="coffee" value="Cafinated"> Cafinated <br>
<input type="checkbox" name="coffee" value="Espresso"> Espresso <br>
<br><br>
Coffee Strength Preferences: <br>
<input type="checkbox" name="strength" value="Dark Roast"> Dark <br>
<input type="checkbox" name="strength" value="Medium Roast"> Medium <br>
<input type="checkbox" name="strength" value="Light Roast"> Light <br>
<br><br>
<input type="submit" class="btn btn-outline-primary" value="Submit">
<br><br>
</form>



<!-- <h1>Checkbox Example</h1>
<form action="checkboxEx">
<input type="checkbox" name="vehicle" value="Volvo"> Volvo <br>
<input type="checkbox" name="vehicle" value="Jeep"> Jeep <br>
<input type="checkbox" name="vehicle" value="Chevy"> Chevy <br>
<input type="submit" value="submit">
</form> -->

<!-- <h1>Dropdown Example</h1>
<form action="dropDown">
<select name="carSelection">
<option value="volvo">Volvo</option>
<option value="jeep">Jeep</option>
<option value="chevy">Chevy</option>
<option value="ford">Ford</option>
</select>
<input type="submit" value="Submit">
</form> -->

<!-- <h1>Radio Button Example</h1>
<form action="radioButton">
<input type="radio" name="gender" value="female"> Female <br>
<input type="radio" name="gender" value="male"> Male <br>
<input type="radio" name="gender" value="other"> Other <br>
<input type="submit" value="Submit">
</form> -->
</div>
</div>
</div>
<div class="footer"></div>
<script src="script.js"></script>
</body>
</html>