<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
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
Connection conn = null;
try {
	conn = DriverManager.getConnection(dbURL, dbUser, dbPasswd);
	out.println(" Connection status: " + conn + "<P>");
} catch (Exception e) {
	out.println("Connection failed: " + e.toString() + "<P>");
}

String sql;
int numRowsAffected;
Statement stmt = conn.createStatement();
ResultSet rs;

//select query
sql = "select employee_id, first_name from employees";
rs = stmt.executeQuery(sql);
while (rs.next()) {
	out.println("Id = " + rs.getString("EMPLOYEE_ID") + ", Name = " + rs.getString("FIRST_NAME") + "<BR>");
}

out.println("<P>");

out.println("<P>");
rs.close();
stmt.close();

//commit only when updating the DB
//conn.commit();
//disconnect
conn.close();
%>







<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>