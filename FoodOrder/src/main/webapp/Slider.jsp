<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="w3-content w3-display-container" style="max-width:85%">

 <c:forEach items="${listRandom}" var="o">
 <a  href="detail?pid= ${o.productID}">  <img class="mySlides" src="${o.image }" height="350px" width="100%"> </a>
 </c:forEach>
  
  <div class="w3-center w3-container w3-section w3-large w3-text-white w3-display-bottommiddle" style="width:100%">
    <div class="w3-left w3-hover-text-khaki" onclick="plusDivs(-1)">&#10094;</div>
    <div class="w3-right w3-hover-text-khaki" onclick="plusDivs(1)">&#10095;</div>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(1)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(2)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(3)"></span>
  </div>
</div>

