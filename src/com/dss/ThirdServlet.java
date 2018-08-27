package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter w = response.getWriter();
		
		String mob = request.getParameter("m");
		String email = request.getParameter("em");
		
		//adding request parameter to Httpsession object
		//as we already have it we can use the existed Httpsession object
		
		HttpSession f = request.getSession(false);
		
		
		//printing all values together
		w.println("User name is "+f.getAttribute("a"));
		w.println("<br>");
		w.println("User Age is "+f.getAttribute("b"));
		w.println("<br>");
		w.println("User Qualification is "+f.getAttribute("c"));
		w.println("<br>");
		w.println("User Designation is "+f.getAttribute("d"));
		w.println("<br>");
		w.println("User mobile number is "+mob);
		w.println("<br>");
		w.println("User email address is "+email);
		
	}

}
