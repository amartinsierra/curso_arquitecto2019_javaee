<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,model.Contacto,daos.DaoContactos"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show contacts here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</head>
<body>
	<%
	List<Contacto> listaContactos=(List<Contacto>)request.getAttribute("contactos");
	%>
<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Email</th>
        <th>Edad</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
	<%for(Contacto contacto:listaContactos){ %>
      <tr>
        <td><%=contacto.getIdContacto() %></td>
        <td><%=contacto.getNombre() %></td>
        <td><%=contacto.getEmail() %></td>
        <td><%=contacto.getEdad() %></td>
        <td><a href="Controller?op=doEliminar&id=<%=contacto.getIdContacto()%>">Eliminar</a></td>
      </tr>
      <%} %>
    </tbody>
  </table>
	
    <div class="col-sm-10">
		
		<a type="button" href='Controller?op=toEntrada' class="btn btn-default">Volver</a>
	</div>
</div>

</body>
</html>