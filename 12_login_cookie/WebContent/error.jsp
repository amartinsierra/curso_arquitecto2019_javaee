<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>El usuario <%=request.getParameter("user")%> con contraseña
	<%=request.getParameter("pwd") %> no está registrado</h1>
	<br/>
	<a href="formulario.html">Volver</a>
</body>
</html>