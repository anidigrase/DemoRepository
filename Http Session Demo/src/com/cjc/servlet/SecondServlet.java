package com.cjc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/second")
public class SecondServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		

		System.out.println("Second-----Servlet");
		
        HttpSession session = req.getSession();
		
		String fname = req.getParameter("t2");
		
		session.setAttribute("sd", fname);
		
		RequestDispatcher rd = req.getRequestDispatcher("third.jsp");
		rd.forward(req, res);
	}
}
