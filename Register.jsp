<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

		<nav class="navbar navbar-expand-lg navbar-light bg-dark">
			<div class="container-fluid">
				<nav class="navbar navbar-light bg-light">
					<div class="container">
						<a class="navbar-brand" href="#"> <img
							src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmA1eBxtqpZSrUECdRXqK1TpV0bHmUXGkOiR9Mtr7aKFkbSzcROt-TNMLBK-XlaOIJSFw&usqp=CAU"
							alt="" width="88" height="48">
						</a>
					</div>
				</nav>
				<div>
				<a href="index.jsp">home</a>
				<a href="Search.jsp">search</a>
				</div>
			</div>
		</nav>
				<form action="display" method="post" >
				<pre>
				
				Company<input type="text" name="companyName" />
				Name<input type="text" name="pasangerName" />
				Cost<input type="text" name="cost" />
				<select name="type">
				<option value=" ">SELECT</option>
		<c:forEach items="${type}" var="t">
		<option value="${t}">${t}</option>
		</c:forEach>
		</select>
				<select name="country">
				<option value=" ">SELECT</option>
		<c:forEach items="${country}" var="c">
		<option value="${c}">${c}</option>
		</c:forEach>
		</select>
				</pre>
				<input type="submit"  value="save">submit
				</form>
	</body>
</html>