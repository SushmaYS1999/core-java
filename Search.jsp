<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
				</nav>
				
				<h1>Search here..!!</h1>
				<h3><span style="color: red;">${message}</span></h3>
				<form action="search" method="get">
				Search By Id<input type="text" name="id" />
				<input type="submit" value="search">
				</form>
				<div>
				<h3>search results</h3>
				
				Company :${dto.companyName} </br>
				Name :${dto.pasangerName} </br>
				Cost :${dto.cost} </br>
				type :${dto.type} </br>
				Country :${dto.country} 
				</div>	
	</body>
</html>