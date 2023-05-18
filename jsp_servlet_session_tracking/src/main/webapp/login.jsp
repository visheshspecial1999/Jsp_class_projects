<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<section class="h-100 gradient-form" style="background-color: #eee;">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-xl-10">
					<div class="card rounded-3 text-black">
						<div class="row g-0">
							<div class="col-lg-6">
								<div class="card-body p-md-5 mx-md-4">

									<div class="text-center">
										<img
											src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/lotus.webp"
											style="width: 185px;" alt="logo">
										<h4 class="mt-1 mb-5 pb-1">welcome to session tracking
											program</h4>
									</div>

									<form action="login" method="post">
										<h4 style="color:green"> Please login to your account</h4>

										<div class="form-outline mb-4">
										<label
												class="form-label" for="form2Example11">Username</label>
											<input type="text"  name="username" id="form2Example11" class="form-control"
												placeholder="enter username" /> 
												
										</div>

										<div class="form-outline mb-4">
										<label class="form-label"
												 for="form2Example22">Password</label>
											<input type="password"  name="password" id="form2Example22"
												class="form-control" /> 
										</div>

										<div class="text-center pt-1 mb-5 pb-1">
											<input
												class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3"
												type="submit" value="Login"/>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>