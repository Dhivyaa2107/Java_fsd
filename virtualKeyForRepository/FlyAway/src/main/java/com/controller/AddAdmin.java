package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import com.bean.AdminLogin;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.AdminService;

/**
 * Servlet implementation class AddAdmin
 */
public class AddAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher rd = request.getRequestDispatcher("adminPage.jsp");
		RequestDispatcher rd1 = request.getRequestDispatcher("addAdmin.jsp");
		response.setContentType("text/html");
		AdminService as = new AdminService();
		PrintWriter out = response.getWriter();
		String email= request.getParameter("email");
		String password=request.getParameter("pwd");
		String rpassword=request.getParameter("rpwd");
		if(rpassword.equals(password)) {
			AdminLogin ad = new AdminLogin();
			ad.setEmail(email);
			ad.setPassword(password);
			out.println(as.addAdminDetails(ad));
			rd.include(request, response);
		}
		else {
			out.println("passowrd must match");
			rd1.include(request, response);
		}
	}
}
