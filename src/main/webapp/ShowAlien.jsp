<%@ page isELIgnored ="false" %>
<%@page import="com.sqli.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

if(session.getAttribute("username")==null) {
	
	response.sendRedirect("LoginAlien.jsp");
}
%>
  
<%
	Alien a1 = (Alien)session.getAttribute("alien");
	//Alien a1 = (Alien)request.getAttribute("alien");
	out.println(a1);
%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/oOm5n8VuOBA" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

</body>
</html>