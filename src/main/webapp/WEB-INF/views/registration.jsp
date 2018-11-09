<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

<h1>Welcome to the Registration Page!</h1>
<h2>Please complete the following form:</h2>

<form action="formresults" onsubmit="return validateInfo();">
First Name: <input id="firstname" type="text" name="firstname"> <br><br>
Last Name: <input id="lastname" type="text" name="lastname"> <br><br>
Primary Phone: <input id="phone" type="text" name="phone" pattern="[1-9]{3}-[1-9]{3}-[1-9]{4}" title="XXX-XXX-XXXX"> <br><br>
Email: <input id="email" type="email" name="email"> <br><br>
Password: <input id="pw" type="password" name="password"> <br><br>
Confirm Password: <input id="confirm" type="password" name="password"> <br><br>
<input type="submit" value="Submit">
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

<script src="script.js"></script>
</body>
</html>