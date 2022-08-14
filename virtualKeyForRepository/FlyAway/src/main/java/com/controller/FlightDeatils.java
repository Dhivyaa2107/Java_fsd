package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Flights;
import com.service.UserService;

/**
 * Servlet implementation class FlightDeatils
 */
public class FlightDeatils extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightDeatils() {
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
		PrintWriter out =  response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd=request.getRequestDispatcher("list Of flights.jsp");
		UserService us = new UserService();
		String src=request.getParameter("src");
		String des=request.getParameter("des");
		String date=request.getParameter("date");
		List<Flights> listOfflight=us.flightDetails(src, des, date);
		if(listOfflight.isEmpty()) {
			out.println("Sorry!!NO flights available");
			rd.include(request, response);
		}
		else {
		HttpSession hs = request.getSession();
		hs.setAttribute("flights", listOfflight);
		response.setContentType("text/html");
		response.sendRedirect("viewFlight.jsp");
		}
	}

}
