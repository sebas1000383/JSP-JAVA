<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/Estilos.css"> 
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<title>Insert title here</title>
</head>
<body>
<a href="Rolcontroler?accion=Agregarusuarios" class="btn btn-primary" role="button"> Agregar nuevo usuario  </a>
<h1> Listado de usuarios </h1>

<table  class="table table-dark table-striped">
<tr>
<th> Id</th>
<th> Nombre </th>
<th> Apellido </th>
<th> Correo </th>
<th> Eliminar </th>
<th> Editar </th>


</tr>

<c:forEach items="${usuarios}" var="r">

					
	<tr>
	<td>${r.getIdusuario()}</td>
	<td>${r.getNombreUsuario()}</td>
	<td>${r.getApellidoUsuario ()}</td>
	<td>${r.getCorreo ()} </td>
	<td> <a class="btn btn-danger" href="Rolcontroler?accion=delete&id=${r.getIdusuario()}" role="button">Eliminar </a></td>
	<td><a class="btn btn-warning" href="" role="button">Editar </a> </td>

	
	
	
	</tr>
</c:forEach>
</table>

</body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</html>