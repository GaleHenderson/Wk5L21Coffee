<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<div class="row">
		<div class="col-8">

<h3>Your Cart:</h3>
		<table class="table">
			<c:forEach var="b" items="${cartlist}">
				<tr>
					<!-- <tr> = table row <td> = table data -->
					<td>${b.itemid}</td>
					<td>${b.cartitemname}</td>
					<td>${b.cartitemdescription}</td>
					<td>${b.cartitemquantity}</td>
					<td>${b.cartitemprice}</td>
					<td><a class="btn btn-primary" href="/remove?cartitemid=${b.cartitemid} ">Remove from Cart</a></td>
				</tr>
			</c:forEach>
		</table>


</div>
</div>
</div>

</body>
</html>