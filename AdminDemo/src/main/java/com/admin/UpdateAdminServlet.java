package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("admiid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		   
		isTrue =AdminDBUtil.updateadmin(id,name,email,phone,username,password);
		
		if(isTrue ==true) {
			
			List<Admin> admiDetails = AdminDBUtil.getAdminDetails(id);
			request.setAttribute("admiDetails",admiDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("adminaccount.jsp");
			dis.forward(request,response);
		}
		else {
			List<Admin> admiDetails = AdminDBUtil.getAdminDetails(id);
			request.setAttribute("admiDetails",admiDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("adminaccount.jsp");
			dis.forward(request,response);
		}
		
		
	}

}
