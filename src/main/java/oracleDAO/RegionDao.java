package oracleDAO;

import java.io.IOException;
import java.sql.*;

import java.util.List;

import oracleDBA.DaoInterface;
import oracleDBA.Region;

public class RegionDao implements DaoInterface<Region> {

	// atributos de la clase
	String sql;
	int numRowsAffected;

	Connection conexion = null;
	ResultSet cursor;
	// public interface
	Statement stmt;

	public static final String dbUser = "hr";
	String dbPasswd = "oracle";
	String dbURL = "jdbc:oracle:thin:@localhost:1521/freepdb1";

	// inicializar

	public RegionDao() {

		// inicializacion
		try {
			Class.forName("oracle.jdbc.drive.OracleDriver");
		} catch (Exception event) {
			System.out.println("Fail to initialize Oracle drive: " + event.toString() + "<P>");
		}

		// Conexion

		try {
			conexion = DriverManager.getConnection(dbURL, " - " + dbUser, " - " + dbPasswd);
			System.out.println(" Connection status: " + conexion + "<P>");

			stmt = conexion.createStatement();
		} catch (Exception event2) {
			System.out.println("Connection failed: " + event2.toString() + "<P>");

		}

	}

	// obtener una region por id

	public Region get(int region) {
		Region region1 = new Region();
		// consultar todo los datos

		// busca una region name por ID getRegion_id();

		// busca una region id por Nombre ( Where ) getRegion_name();

		sql = "select region_name from Regions Where Region_id=" + region1.getRegion_id();
		// sql = "select region_name from Regions Where Region_id=" +
		// t.getRegion_name();
		try {

			cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_ID") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}
			System.out.println(stmt);
			System.out.println(conexion);
			cursor.close();
			stmt.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		System.out.println("<P>");
		System.out.println("<P>");

		return region1;
	}

	public Region get_name(Region t) {

		// TODO Auto-generated method stub

		// Devolver todo los nombres por getRegion_id( )

		sql = "select region_name From Regions";

		// Devolver un nombre

		try {
			this.cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("Region_id") + ", Name = "
						+ cursor.getString("Region_Name") + "<BR>");

			}
			cursor.close();
			stmt.close();
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("<P>");

		System.out.println("<P>");

		return t;

	}

	public Region get_id(Region t) {
		// TODO Auto-generated method stub

		sql = "Select region_id From Region";

		try {
			this.cursor = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("Region_id") + ", Name = "
						+ cursor.getString("Region_Name") + "<BR>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<P>");

		System.out.println("<P>");
		try {
			cursor.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// commit only when updating the DB
		// conn.commit();
		// disconnect
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	public List<Region> getAll() {
		// TODO Auto-generated method stub

		sql = "Select * From Region;";
		try {
			cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_id") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}
			cursor.close();
			stmt.close();
			conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("<P>");

		System.out.println("<P>");

		// commit only when updating the DB
		// conn.commit();
		// disconnect

		return getAll();
	}

	public void delete(Region t) {

		// TODO Auto-generated method stub

		sql = "Delecte FROM Regions WHERE region_name= America";
		try {
			this.cursor = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("Region_id") + ", Name = "
						+ cursor.getString("Region_Name") + "<BR>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<P>");

		System.out.println("<P>");
		try {
			cursor.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// commit only when updating the DB
		// conn.commit();
		// disconnect
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Region update(Region t, String[] params) {
		// TODO Auto-generated method stub
		sql = "UPDATE Regions SET Region_name =" + t.getClass();
		try {
			cursor = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// While

		try {
			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_id") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<P>");

		System.out.println("<P>");
		try {
			cursor.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// commit only when updating the DB
		// conn.commit();
		// disconnect
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	public Region save(Region t) {
		// TODO Auto-generated method stub

		sql = "Insert into Region (Region_name) VALUES(Oceania)";
		try {
			cursor = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_id") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<P>");

		System.out.println("<P>");
		try {
			cursor.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// commit only when updating the DB
		// conn.commit();
		// disconnect
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public Region get(Region t) {
		// TODO Auto-generated method stub
		return null;
	}
}