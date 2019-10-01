package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDBConexion {
	public static Connection getConexion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/bd_comercio", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
