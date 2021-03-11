package com.cjc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/log")
public class FirstServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		

		System.out.println("First-----Servlet");
		
		HttpSession session = req.getSession();
		
		String fname = req.getParameter("t1");
		
		session.setAttribute("fd", fname);
		
		RequestDispatcher rd = req.getRequestDispatcher("second.jsp");
		rd.forward(req, res);
	}
}
