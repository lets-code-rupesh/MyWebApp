<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<div class="row">
			<form action="addAlien">
				<div class="col-3">
					<label for="exampleFormControlInput1" class="form-label">UserName</label>
					<input type="text" class="form-control" id="name" name="name"
						placeholder="Enter your Username">
				</div>
				<div class="col-3">
					<label for="exampleFormControlInput1" class="form-label">Password</label>
					<input type="password" class="form-control" id="password"
						name="passowrd" placeholder="Enter your Password">
				</div>
				<button type="button btn btn-success">Submit </button>
			</form>
		</div>
	</div>

</body>
</html>