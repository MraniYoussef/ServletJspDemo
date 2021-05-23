package com.sqli.web.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sqli.web.dao.LoginDao;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recevoir les donner envoyer par le client (login.jsp)
		String uname= request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		LoginDao dao = new LoginDao(); 
		
		if(dao.check(uname, pass)) {
			HttpSession session = request.getSession();
				session.setAttribute("username", uname);
			response.sendRedirect("index.jsp");
		}
		else {
			response.sendRedirect("LoginAlien.jsp");
		}
	}

	

}
