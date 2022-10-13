package com.samples.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.samples.domain.products;
import com.samples.utils.HibernateUtil;

/**
 * Servlet implementation class prodDetailsServlet
 */
@WebServlet("/addProductServlet")
public class addProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	List<products> details = new ArrayList<>();
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		String prodID = request.getParameter("productID");
		String prodName = request.getParameter("productName");
		String quantity = request.getParameter("quantity");
		
		products prod = new products(prodID, prodName, quantity); 
		
		session.save(prod);
		
		session.getTransaction().commit();
		
		session.close();
		
		// displaying the table
		details.add(prod);
		// Product_details is used in for-each loop in the .jsp file
		request.setAttribute("Product_Details", details);
		// forwarding the request to the .jsp file
		RequestDispatcher rd = request.getRequestDispatcher("/Success.jsp");
		rd.forward(request, response);
		
	}

}
