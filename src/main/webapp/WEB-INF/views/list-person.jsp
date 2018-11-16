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
<table class="table">
			<thead>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>PW</th>
				<th>Phone</th>
			</thead>
<%-- 			<tbody>

				<c:forEach items="${food}" var="f">
					<tr>
						<td>${f.name}</td>
						<td>${f.category}</td>
						<td>${f.description}</td>
						<td> <a class="btn btn-primary" href ="/update?id=${f.id}">Edit</a></td>
						<td> <a class="btn btn-primary" href ="/delete?id=${f.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody> --%>
		</table>
</div>
</body>
</html>