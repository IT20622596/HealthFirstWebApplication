package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteScheduleServlet")
public class DeleteScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String appointmentid = request.getParameter("scheappointmentid");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.deleteSchedule(appointmentid);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("schedule.jsp");
			dispatcher.forward(request,response);
		}
		else {
			List<Schedule> scheDetails = AdminDBUtil.getScheduleDetails(appointmentid);
			request.setAttribute("scheDetails",scheDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("appointform.jsp");
			dispatcher.forward(request,response);
		}
	}

}
