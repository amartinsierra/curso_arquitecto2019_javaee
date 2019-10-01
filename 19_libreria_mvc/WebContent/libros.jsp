<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
	import="java.util.*,javabeans.*"%>

<html>
<head>
<title>libros</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
 <c:set var="libros" value="${requestScope.libros}"/>   
<c:choose>
	<c:when test="${!empty libros}">

		<table border="1">
		    <tr><th>Titulo</th><th>Autor</th><th>Precio</th></tr>		    	
		    	<c:forEach var="lib" items="${libros}">
		    		<tr>
		    			<td>${lib.titulo}</td>
						<td>${lib.autor}</td>
						<td>${lib.precio}</td>
					</tr>		    	
		    	</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h2>No hay libros</h2>
	</c:otherwise>
</c:choose>
<br/><br/>
<a href="Controller?op=doTemas">Otro tema</a>
</body>
</html>