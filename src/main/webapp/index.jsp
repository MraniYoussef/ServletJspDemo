<%@ page isELIgnored ="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>

 <%

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if(session.getAttribute("username")==null) {
	
	response.sendRedirect("LoginAlien.jsp");
}
%> 

 Welcome
 ${ username }
	<form action="getAlien">
		<input type="text" name="aid">
		<input type="submit">
	</form>
	
	<form action="logout">
		
		<input type="submit" value="logout">
	</form>
	
</body>
</html>
