<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Edit - Product Manager</title>
<meta charset="utf-8">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<style>
body {
	background-color: #25274d;
}

.contact {
	padding: 4%;
	height: 400px;
}

.col-md-3 {
	background: #ff9b00;
	padding: 4%;
	border-top-left-radius: 0.5rem;
	border-bottom-left-radius: 0.5rem;
}

.contact-info {
	margin-top: 10%;
}

.contact-info img {
	margin-bottom: 15%;
}

.contact-info h2 {
	margin-bottom: 10%;
}

.col-md-9 {
	background: #fff;
	padding: 3%;
	border-top-right-radius: 0.5rem;
	border-bottom-right-radius: 0.5rem;
}

.contact-form label {
	font-weight: 600;
}

.contact-form button {
	background: #25274d;
	color: #fff;
	font-weight: 600;
	width: 25%;
}

.contact-form button:focus {
	box-shadow: none;
}
</style>
<body>

	<!------ Include the above in your HEAD tag ---------->

	<div class="container contact">
		<div class="row">
			<div class="col-md-3">
				<div class="contact-info">
					<img src="https://cdn-icons-png.flaticon.com/128/1159/1159633.png"
						alt="image" />
					<h2>Edit Product</h2>
					
				</div>
			</div>
			<div class="col-md-9">
				<div class="contact-form">
				<form action="edit" method="post" >
					<div class="form-group">
						
							<label class="control-label col-sm-2" for="fname"> Name :</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" 
									value= " ${product.name } " name="txtname">
							</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="lname">Image :</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" 
								placeholder="Enter Image" name="txtimage">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Price :</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" 
								value="${product.price }" name="txtprice">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="lname">Title :</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" 
								placeholder="${product.title }" name="txttitle">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="comment">Description:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" placeholder=${product.description }
							  name="txtdescription"></input>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="lname">Type :   </label>
						<span> (1: Sáng, 2: Trưa, 3: Chiều, 4: Tối) </span>
						<div class="col-sm-10">
							<input type="text" class="form-control" 
								placeholder="${product.cID }" name="txttype">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						  <a href="managerProduct">	<button type="button" class="btn btn-default"> Cancel</button></a>
							
						</div>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>