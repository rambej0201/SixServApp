package com.dss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
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
		
		String UserQ = request.getParameter("uq");
		String UserD = request.getParameter("ud");
		
		//create the Httpsession object with request, 
		//as we've object in previous Servlet we can use the same object again
		HttpSession f = request.getSession(false);
		
		//adding request data to HttpSession object
		f.setAttribute("c", UserQ);
		f.setAttribute("d", UserD);
		
		//forward the added details to formThree.html by using RequestDispatcher object
		RequestDispatcher qu = request.getRequestDispatcher("formThree.html");
		qu.forward(request, response);
		
		
	}

}
