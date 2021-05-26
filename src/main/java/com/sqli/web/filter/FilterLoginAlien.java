package com.sqli.web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class FilterLoginAlien implements Filter {

    
    public FilterLoginAlien() {  }

	public void destroy() {	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		
		String uname= request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if (uname.length()>2)
			
		chain.doFilter(request, response);
		
		else 
			out.println(" Invalid input");
			
		
		if (Integer.parseInt(pass)>1)
			
			chain.doFilter(request, response);
			
			else 
				out.println(" Invalid input");
				
			
	}

	
	public void init(FilterConfig fConfig) throws ServletException {}

}
