<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="Mycss.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="body2">

<div class="topnav">
  <a href="Home2.jsp">Home</a>
  <a href="Appointments.jsp">Appointments</a>
  <a href="Diagnostics.jsp">Diagnostics</a>
  <a class="active" href="#">Profile</a>
  <a href="Aboutus.jsp">About us</a>
  <a href="Home.jsp">Log out</a>
</div>
	<div class="d1">
	<h2>Profile Details</h2>
	<div class="d2">
	<div class="d3">

	<table>
	<c:forEach var="admi" items="${admiDetails}">
	

	<c:set  var="id" value="${admi.id}"/>
	<c:set  var="name"  value="${admi.name}"/>
	<c:set  var="email" value="${admi.email}"/>
	<c:set  var="phone" value="${admi.phone}"/>
	<c:set  var="username" value="${admi.userName}"/>
	<c:set  var="password" value="${admi.password}"/>
	
	
	
	
	
	<tr>
		<td>Admin ID</td>
		<td>${admi.id}</td>
	</tr>
	<tr>
		<td>Admin Name</td>
		<td>${admi.name}</td>
	</tr>
	<tr>
		<td>Admin Email</td>
		<td>${admi.email}</td>
	</tr>
	<tr>
		<td>Admin Phone</td>
		<td>${admi.phone}</td>
		
	</tr>
	<tr>
		<td>Admin User Name</td>
		<td> ${admi.userName}</td>
	</tr>
	
	<tr>
		<td>Admin Password</td>
		<td> ${admi.password}</td>
	
	</tr>
	

  </c:forEach>
  </table>
  </div>
   <c:url value="updateadmin.jsp" var="admiupdate">
  		<c:param name="id" value="${id}"/>
  		<c:param name="name" value="${name}"/>
        <c:param name="email" value="${email}"/>
        <c:param name="phone" value="${phone}"/>
        <c:param name="uname" value="${username}"/>
        <c:param name="pass" value="${password}"/>
    
  
  </c:url>
  
  <br>
  <a href="${admiupdate}">
  <button class="button">Update My Data</button>
  
 
  </a>
  
  <br><br>
  
  <c:url value ="deleteadmin.jsp" var="admidelete">
  
  		<c:param name="id" value="${id}"/>
  		<c:param name="name" value="${name}"/>
        <c:param name="email" value="${email}"/>
        <c:param name="phone" value="${phone}"/>
        <c:param name="uname" value="${username}"/>
        <c:param name="pass" value="${password}"/>
    
   
  </c:url>
  
  <a href ="${admidelete}">
  <button class="button">Delete My Account</button>
  
  </a>
  </div>
  </div>
  <!--Footer-->
	<div class="footer">
		<div class="footer-content">
			<div class="footer-section-about">
				<h3 class="logo-text"> <span></span> About Us</h3>
				<p>
					We make you healthy.<br> Make your life a worthy one.<br>Visit us!
				</p>
			</div>
			<div class="footer-section-links">
				<h3>Reach Us</h3>
				<p>No. 3/13,<br>Sumangala Road,<br>Colombo 02</p>
			</div>
			<div class = "Contact-Us">
				<h3>Contact Us</h3>
				<p>healthfirstcolombo@gmail.com<br>0719945268 - Pasindu<br>0714593658 - Shan<p>
			</div>
			<div class = "Barcode">
				<image src = "Images/barcode.JPG" alt = "Barcode Image" width= "80" height= "80">
			</div>
			<div class = "Social">
				<a href = "https://www.facebook.com/" >
					<image src ="Images/fb.JPG" class = "facebook" width= "60" height= "60";>
				</a>
				<a href = "https://www.twitter.com/">
					<image src ="Images/twitter.JPG" class = "twitter" width= "60" height= "60";>
				</a>
				<a href = "https://www.instagram.com/">
					<image src ="Images/inster.JPG" class = "instagram" width= "60" height= "60";>
				</a>
				<a href = "https://www.youtube.com/">
					<image src ="Images/youtube.JPG" class = "youtube" width= "60" height= "60";>
				</a>
			</div>
		</div>
	</div>
  
</body>
</html>






