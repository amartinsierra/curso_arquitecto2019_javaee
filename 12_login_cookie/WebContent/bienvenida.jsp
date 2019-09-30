<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Persona"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%-- 
	<%Persona persona=(Persona)session.getAttribute("persona"); %>
	Usuario:<%=persona.getUsuario() %><br/>
	Email:<%=persona.getEmail() %><br/>
	Edad:<%=persona.getEdad() %><br/>
	--%>
	Usuario:${sessionScope.persona.usuario}<br/>
	Email:${sessionScope.persona.email}<br/>
	Edad:${sessionScope.persona.edad}<br/>
	<br/>
	<a href="preferencias.html">Volver</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="Cierre">Cerrar</a>
</body>
</html>