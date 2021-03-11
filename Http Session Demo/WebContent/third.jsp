<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>third page</title>
</head>
<body>
	<form action="third">
		 FirstData:-<%= session.getAttribute("fd") %><br>
	     SecondData:-<%= request.getParameter("t2") %>
		<br> ThirdData:- <input type="text" name="t3"> <br>
		<input type="submit" value="OK">
	</form>
</body>
</html>