<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="style.css">
</head>
<body>

	<h1>Base de datos JDBC</h1> 

<div class = "contenedor">
	<label class="paginado">pagina 1/2</label>
	
	<form style=""text-align:center;" href="index.jsp" name=consulta>
		<label> Consulta </label> <input type="text" name="textQuery"><input
			type="submit">

	<table border="1">
		<tr>

			<th>ID</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Salario</th>
			<th>Vacaciones</th>
			<th><img src></th>
			<th><img src></th>
			<th><img src></th>
		</tr>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td><input type="button"name="actualizar" value="actualizar"></td>
			<td><input type="button"name="insertar" value="añadir"></td>
			<td><input type="button"name="borrar" value="borrar"></td>
		</tr>
	</table>
	
	</form> <!--  cierro formulario con tabla -->
	</div>
</body>
</html>