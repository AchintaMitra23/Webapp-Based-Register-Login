import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBase {
	
	public String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public String USER = "system";
	public String PASS = "achintamitra23";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public String insertData(Member mem) {
		loadDriver(DRIVER);
		Connection conn = getConn();
		String res = "Data has been inserted successfully...";
		String sql = "insert into member values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mem.getUserName());
			ps.setString(2, mem.getPassWord());
			ps.setString(3, mem.getEmail());
			ps.setString(4, mem.getPhoneNo());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			res = "Unsuccessful to enter the data into database...";
		}
		return res;
	}
}
