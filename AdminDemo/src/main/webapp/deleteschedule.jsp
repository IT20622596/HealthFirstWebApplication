<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Mycss.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="body33">

<div class="topnav">
  <a href="Home2.jsp">Home</a>
  <a href="Appointments.jsp">Appointments</a>
  <a href="Diagnostics.jsp">Diagnostics</a>
  <a href="Aboutus.jsp">About us</a>
  <a href="Home.jsp">Log out</a> 
</div>


	<%
		String appointmentid = request.getParameter("appointmentid");
		String doctorname = request.getParameter("doctorname");
		String patientname = request.getParameter("patientname");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
	
	
	%>	
	<div class="d1">
	<br><br><br>
	
	<form action="deletesche" method="post">
    Appointment ID<input type="text" name="scheappointmentid" value="<%= appointmentid %>" readonly><br>
   	Doctor Name<input type="text" name="docname" value="<%= doctorname %>" readonly><br>	
   	Patient Name<input type="text" name="patname" value="<%= patientname %>" readonly><br>		
    Appointment Date<input type="text" name="date" value="<%= date %>" readonly><br>    	
    Appointment Time<input type="text" name="time" value="<%= time %>"readonly><br>    	
        	
    <br>
     <button class="button">Delete the Schedule</button>
             
   
   </form>
	</div>
	<br><br><br><br>
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