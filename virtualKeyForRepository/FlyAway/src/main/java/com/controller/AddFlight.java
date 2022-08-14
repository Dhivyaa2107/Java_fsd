package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Flights;
import com.service.AdminService;

/**
 * Servlet implementation class AddFlight
 */
public class AddFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlight() {
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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int srno=Integer.parseInt(request.getParameter("srno"));
		String fname=request.getParameter("fname");
		String src=request.getParameter("src");
		String des=request.getParameter("des");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		int price=Integer.parseInt(request.getParameter("price"));
		int seat=Integer.parseInt(request.getParameter("seat"));
		
		Flights f =new Flights();
		f.setDate(date);
		f.setDestination(des);
		f.setFname(fname);
		f.setPrice(price);
		f.setSeats(seat);
		f.setSource(src);
		f.setSrno(srno);
		f.setTime(time);
		
		AdminService as = new AdminService();
		out.println(as.addFlightDetails(f));
		RequestDispatcher rd= request.getRequestDispatcher("addFlight.jsp");
		rd.include(request, response);
	}
}
