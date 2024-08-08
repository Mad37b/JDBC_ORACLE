<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ page import="oracleDAO.*" %>
<%@ page import="oracleDBA.*" %>
<%@ page import="java.sql.*" %>
<head>
<meta charset="ISO-8859-1">
<title>testOracle</title>
</head>
<body>

<!--  Test con region por metodos  -->

	<!-- Establecer la conexion -->
	
	<%
	 Region regionJSP = new Region (); 
	RegionDao regionDao = new RegionDao();
	
	int regionid=1;
	
	// resultado de la consulta 
	
	try{
	regionJSP = regionDao.get(regionid);
	}catch(SQLException e){
	out.print("salta exception 1");
	
	}
	
	
	
	%>
	<!--  Buscar region por id por Metodo  -->
	<% out.print("bye bye  la consulta se ha hecho con exito");%>

</body>
</html>