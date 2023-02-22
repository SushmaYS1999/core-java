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
							src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
							alt="" width="88" height="48">
						</a>

					</div>
				</nav>
				<div>
				<a href="index.jsp">home page</a><br>
				</div>
			</div>
		</nav>
		

			<h1>welcome to details of valentines</h1>
			
		<c:forEach items="${error}" var="e">
		<h6 style="color:red;">${e.message}</h6>
		</c:forEach>
		
		<form action="valentine" method="post">
		
		<pre>
		name<input type="text" name="name" value="${dto.name}">
		valentineName<input type="text" name="valentineName" value="${dto.valentineName} ">
		places<select name="places">
		<option value=""></option>
		<c:forEach items="${places}" var="p">
		<option value="${p}">${p}</option>
		</c:forEach>
		</select>
		
		gifts<select name="gifts">
		<option value=""></option>
		<c:forEach items="${gifts}" var="g">
		<option value="${g}">${g}</option>
		</c:forEach>
		</select>
		
		<input type="submit" class="btn btn-dark" value="save" >
		</pre>
		</form>
</body>
</html>