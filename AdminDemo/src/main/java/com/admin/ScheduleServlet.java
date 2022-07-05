package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String appointmentid = request.getParameter("apid");
	try {
		
	
	    List<Schedule>scheDetails=AdminDBUtil.validate(appointmentid);
	    request.setAttribute("scheDetails",scheDetails);
	}
	catch(Exception e) {
		
		e.printStackTrace();
	}
	
	    RequestDispatcher dis = request.getRequestDispatcher("appointform.jsp");
	    dis.forward(request,response);
	}

}
