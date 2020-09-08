package RegisterLoginClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public String USER = "system";
	public String PASS = "achintamitra23";
	
	public void loadDriver() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection conn = null;
	public Connection getConn() {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
