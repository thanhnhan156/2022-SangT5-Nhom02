<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/logoFood-Order.png" type="image/x-icon">
<title>Food Order</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<style>
.mySlides {display:none}
.w3-left, .w3-right, .w3-badge {cursor:pointer}
.w3-badge {height:13px;width:13px;padding:0}
</style>

	<jsp:include page="Menu.jsp"></jsp:include>
	<jsp:include page="Slider.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div class="col">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="Home">Home</a></li>
						<li class="breadcrumb-item"><a href="Home">Category</a></li>
						<li class="breadcrumb-item active" aria-current="#">Sub-category</li>
					</ol>
				</nav>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">

			<jsp:include page="Left.jsp"></jsp:include>

			<div class="col-sm-9">
				<div class="row">
					<c:forEach items="${listP}" var="o">
						<div class="col-12 col-md-6 col-lg-4">
							<div class="card">
							<a href="detail?pid= ${o.productID}"><img class="card-img-top" src="${o.image}" alt="Card image cap" height="250px" width="200px"></a>
								<div class="card-body">
									<h4 class="card-title show_txt">
										<a href="detail?pid= ${o.productID}" title="View Product">${o.name}</a>
									</h4>
									<p class="card-text show_txt">${o.title}</p>
									<div class="row">
										<div class="col">
											<p class="btn btn-danger btn-block">${o.price}<sup>đ</sup></p>
										</div>
										<div class="col">
											<a href="#" class="btn btn-success btn-block">Add to cart</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>

		</div>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
	<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 3000); // Change image every 2 seconds
}
</script>


<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" w3-white", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-white";
}
</script>
	
</body>
</html>

