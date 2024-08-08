<%@page import="java.util.Date"%>

<%@ page import="java.sql.*"%>
<%@ page import="com.iesVda.oracleDBA.RegionDao"%>
<%@ page import="com.iesVda.oracleDBA.Region" %>
<%@ page import="com.iesVda.oracleDBA.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
//initialize driver class
try { 
Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (Exception e) {
out.println("Fail to initialize Oracle JDBC driver: " + e.toString() + "<P>");
}
String dbUser = "hr";
String dbPasswd = "oracle";
String dbURL = "jdbc:oracle:thin:@localhost:1521/freepdb1";

//connect
Connection conexion = null;
String sql;
sql = "select * from Jobs";
try {
conexion = DriverManager.getConnection(dbURL,dbUser,dbPasswd);
out.println(" Connection status: " + conexion + "<P>");



int numRowsAffected;
Statement stmt = conexion.createStatement();
ResultSet cursor;

// insert query regions
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Consulta de datos  "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
 

// select query regions

RegionDao newRegionDao = new RegionDao ();

JobsDao jobsDao = new JobsDao();
Jobs job = new Jobs();
cursor = stmt.executeQuery(sql);
List<Jobs> jobs = jobsDao.get(t);
while (cursor.next()) {

	
	cursor.getString("job_id");
    cursor.getString("job_title");
    cursor.getFloat("min_salary");
    cursor.getFloat("max_salary");
   
   
}

for (Jobs jobb : jobs) {
    // Aquí puedes hacer lo que necesites con cada objeto Job, como imprimir sus atributos
    // por ejemplo:
    System.out.println("Job ID: " + job.getJobId());
    System.out.println("Job Title: " + job.getJobTitle());
    System.out.println("Min Salary: " + job.getMinSalary());
    System.out.println("Max Salary: " + job.getMaxSalary());
}

out.println("<P>");

out.println("<P>");
cursor.close();
stmt.close();

}catch(SQLException e){
	out.println("Connection failed: " + e.toString() + "<P>");
	
}

// select query countries 

//commit only when updating the DB
//cone.commit();
//disconnect
//conexion.close();
%> 


<HTML>
<BODY>
<h3>Bye bye! The system time is now</h3> 

<%=new java.util.Date() %>

</BODY>
</HTML>