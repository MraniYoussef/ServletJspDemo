package com.sqli.web.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//pour quitter la session
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		//pour supprimer toutes les enregitrements
		session.invalidate();
		response.sendRedirect("LoginAlien.jsp");
		
	}

	

}
