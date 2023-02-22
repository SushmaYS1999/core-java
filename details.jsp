<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			</div>
		</nav>
		<div>

			<h1>save details of bakery</h1>
		</div>
		<form action="bakery" method="post">
		
			<div class="mb-3">
				<label for="name" class="form-label">Bakery Name</label> <input type="text"
					class="form-control" id="name" name="bname" placeholder="enter Bakery name">
			</div>
			
			<div class="mb-3">
				<label for="name" class="form-label">Bakery Owner</label> <input type="text"
					class="form-control" id="name" name="owner" placeholder="enter owner name">
			</div>
			
			<div class="mb-3">
				<label for="name" class="form-label">Bakery Owner wifename</label> <input type="text"
					class="form-control" id="name" name="wife" placeholder="enter owner wifename">
			</div>
			
			<div>
			Bakery Owner married yes<input type="radio" name="free" value="true" />
					no<input type="radio" name="not" value="false" />
			</div>
			
			<div class="mb-3">
				<label for="name" class="form-label">Bakery Famous sweet</label> <input type="text"
					class="form-control" id="name" name="sweet" placeholder="enter famous sweet">
			</div>
			
			<div class="mb-3">
				<label for="name" class="form-label">Bakery since</label> <input type="text"
					class="form-control" id="name" name="since" placeholder="bakery since">
			</div>
			
			<input type="submit" class="btn btn-dark" value="Send" >
		</form>
</body>
</html>
