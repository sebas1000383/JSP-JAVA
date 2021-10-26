<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Registrar</title>
</head>
<body>
<h1> Esta en el registro </h1>
<form method="post" action="Rolcontroler?accion=Nuevousuario">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Nombre : </label>
    <input type="text" class="form-control" id="nombre" name="nombre" >
    
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Apellido:  </label>
    <input type="text" class="form-control" id=apellido" name="apellido">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Correo:  </label>
    <input type="text" class="form-control" id="correo" name="correo">
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Contraseña: </label>
    <input type="text" class="form-control" id="nombre" name="contraseña" >
    
  </div>
   
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
