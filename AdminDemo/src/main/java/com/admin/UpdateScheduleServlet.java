package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateScheduleServlet")
public class UpdateScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String appointmentid = request.getParameter("scheappointmentid");
		String doctorname = request.getParameter("docname");
		String patientname = request.getParameter("patname");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.updateschedule(appointmentid,doctorname,patientname,date,time);
		
		if(isTrue == true) {
			
			List<Schedule> scheDetails = AdminDBUtil.getScheduleDetails(appointmentid);
			request.setAttribute("scheDetails",scheDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("appointform.jsp");
			dis.forward(request,response);
		}
		else {
			
			List<Schedule> scheDetails = AdminDBUtil.getScheduleDetails(appointmentid);
			request.setAttribute("scheDetails",scheDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("appointform.jsp");
			dis.forward(request,response);
		}
		
		
	}

}
