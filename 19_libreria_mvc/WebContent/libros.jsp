
<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
	import="java.util.*,javabeans.*"%>

<html>
<head>
<title>libros</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
    
<%List<Libro> libros=(List<Libro>)request.getAttribute("libros"); 
	if(libros!=null && libros.size()>0){%>

		<table border="1">
		    <tr><th>Titulo</th><th>Autor</th><th>Precio</th></tr>		    	
		    	<%for(Libro lib:libros){ %>
		    		<tr>
		    			<td><%=lib.getTitulo()%></td>
						<td><%=lib.getAutor()%></td>
						<td><%=lib.getPrecio()%></td>
					</tr>		    	
		    	<%} %>
		</table>
	<%}else{%>
		<h2>No hay libros</h2>
	<%}%>
<br/><br/>
<a href="Controller?op=doTemas">Otro tema</a>
</body>
</html>