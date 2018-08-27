package com.dss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
		/*
		 *Step1: Display the form page
		 *Step2: Get the request details
		 *Step3: Prepare Httpsession object
		 *Step4: Add request details to Httpsession object
		 *Step5: Forward request to next form
		 * */
		
		//gettting request details
		String uname = request.getParameter("un");
		String uage = request.getParameter("ua");
		
		//create Httpsession object
		HttpSession f = request.getSession();
		
		//add request details to Httpsession
		f.setAttribute("a", uname);
		f.setAttribute("b", uage);
		
		//forward the added details to next formTwo.html by using object RequestDispatcher
		RequestDispatcher re = request.getRequestDispatcher("formTwo.html");
		re.forward(request, response);
		
	}

}
