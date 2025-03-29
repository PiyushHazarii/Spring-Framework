<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
	<body>
		<div class="container-fluid bg-primary header_design">
			<div class="container">
				<div class="row">
					<div class="col-3">
						<a href="#" class="navbar-brand text-light">CRM Application</a>		
					</div>
					<div class="col-6"></div><!--ye wala beech mein space provide kr dega  -->
					<div class="col-3">
						<button type="button" class="btn btn-info dropdown-toggle" data-bs-toggle="dropdown">More</button>
						<ul class="dropdown-menu">
							<li><a href="#" class="dropdown-item">Home</a></li>
							<li><a href="#" class="dropdown-item bg-secondary text-light">Login</a></li>
							<li><a href="#" class="dropdown-item">About Us</a></li>
							<li><a href="#" class="dropdown-item">Contact Us</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	        <div class="container-fluid">
			    <div class="container">
			        <div class="row">
			            <div class="col-4"></div>
			            <div class="col-4 d-flex justify-content-center">
			                <div class="login_div_design bg-light">
			                    <h3>Login Here</h3><br />
			                    <div class="mb-3">
			                        <label class="form-label">Enter Email</label>
			                        <input type="text" name="email" class="form-control" />
			                    </div>
			                    <div class="mb-3">
			                        <label class="form-label">Enter Password</label>
			                        <input type="password" name="passl" class="form-control" />
			                        <div class="form-text">We will not share your email id with anyone...</div>
			                    </div>
			                    <input type="submit" value="Login" class="btn btn-primary" />
			                </div>
			                I
			            </div>
			            <div class="col-4"></div>
			        </div>
			    </div>
			</div>
	</body>
</html>