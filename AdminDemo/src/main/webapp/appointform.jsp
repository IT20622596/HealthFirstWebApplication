<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Mycss.css">

<meta charset="ISO-8859-1">
<title>Insert Title Here</title>
</head>
<body id="body31">

<div class="topnav">
  <a href="Home2.jsp">Home</a>
  <a class="active" href="#">Appointments</a>
  <a href="Diagnostics.jsp">Diagnostics</a>
  <a href="Aboutus.jsp">About us</a>
  <a href="Home.jsp">Log out</a> 
</div>
<div class="d1">

<h2>Schedule</h2>
<div class="d5">
<div class="d4">
    <table>
	<c:forEach var="sche" items="${scheDetails}">
	
	<c:set var="appointmentid" value="${sche.appointmentid }"/>
	<c:set var="doctorname" value="${sche.doctorname}"/>
	<c:set var="patientname" value="${sche.patientname}"/>
	<c:set var="date" value="${sche.date}"/>
	<c:set var="time" value="${sche.time}"/>
	
	
	
	
	
	
	<tr>
		<td>Appointment ID</td>
		<td>${sche.appointmentid}</td>
	
	</tr>
	<tr>
	   <td>Doctor Name</td>
	   <td>${sche.doctorname}</td>
	
	</tr>
	<tr>
		<td>Patient Name</td>
		<td>${sche.patientname}</td>
	
	</tr>
	<tr>
		<td>Appointment Date</td>
		<td> ${sche.date}</td>
	
	
	</tr>
	<tr>
		<td>Appointment Time</td>
		<td>${sche.time}</td>
		
	</tr>
	
	 
	 </c:forEach>
    </table>
   </div>
    
    <c:url value="updateschedule.jsp" var="scheupdate">
    	<c:param name="appointmentid" value="${appointmentid}"/>
    	<c:param name="doctorname" value="${doctorname}"/>
    	<c:param name="patientname" value="${patientname}"/>
    	<c:param name="date" value="${date}"/>
    	<c:param name="time" value="${time}"/>
    	
   </c:url>
    <a href="${scheupdate}">
    
     <button class="button">Update the Schedule</button>
   
    </a>
    
    <br>
    <c:url value="deleteschedule.jsp" var="schedelete">
        <c:param name="appointmentid" value="${appointmentid}"/>
    	<c:param name="doctorname" value="${doctorname}"/>
    	<c:param name="patientname" value="${patientname}"/>
    	<c:param name="date" value="${date}"/>
    	<c:param name="time" value="${time}"/>
    
    
    
   </c:url>
    
    <br>
    <a href="${schedelete}">
     <button class="button">Delete the Schedule</button>
   
    
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