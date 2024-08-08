package oracleDAO;

import oracleDBA.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.*;

public class JobsDao extends Jobs implements DaoInterface<Jobs>{
	
	String query;
	int numRowsAffected;

	Connection Conexion = null;
	ResultSet cursor;
	// public interface
	Statement stmt;
	

	public static final String dbUser = "hr";
	String dbPasswd = "oracle";
	String dbURL = "jdbc:oracle:thin:@localhost:1521/freepdb1";
	
	
public JobsDao() {
	
	try {
        // Inicializar la conexión a la base de datos
        Conexion = DriverManager.getConnection(dbURL, dbUser, dbPasswd);
        // Inicializar el objeto Statement
        stmt = Conexion.createStatement();
    } catch (SQLException e) {
        e.printStackTrace();
        // Manejar cualquier error de conexión aquí
    }
	
}
	@Override
	
	 // si lo dejo asi aunque lo depure , solamente lo que retorna es el ultimo o un unico valor
	public Jobs get(String table) {
		
		String sql="Select * From Jobs";
		Jobs jobs = new Jobs();
		
		try {
			cursor=stmt.executeQuery(sql);
			
			while(cursor.next()) {
				jobs.setJob_id(cursor.getString("job_id"));
				jobs.setJob_title(cursor.getString("job_title"));
				jobs.setMin_salary(cursor.getFloat("Min_Salary"));
				jobs.setMax_salary(cursor.getFloat("Max_Salary"));
				
				
			}
			
			
			cursor.close(); 
	        stmt.close(); 
	        Conexion.close();
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Consulta finalizada");
		}
		
		
		
		
		
		
		return jobs;
	}

	@Override
	public List<Jobs> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jobs save(Jobs table) {
		return table;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jobs update(Jobs table, String[] params) {
		return table;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Jobs table) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Jobs get_name(Jobs t) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Jobs get_id(Jobs t) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Jobs get(Jobs t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}