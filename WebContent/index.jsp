<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<h1>Server <%=request.getServerName()%></h1>
Server : <%=getServletContext().getServerInfo()%><br>
The time is now <%=new java.util.Date()%><br>
<p>
<a href="Hello">Hello</a><br>
<a href="hellosoap">Hello from JAX-WS </a>
</body>
</html>
