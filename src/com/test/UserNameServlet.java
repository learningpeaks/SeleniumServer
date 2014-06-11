package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	private void processRequest(HttpServletRequest request, 
		HttpServletResponse response) throws IOException, ServletException{
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("userName", userName);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}
}
