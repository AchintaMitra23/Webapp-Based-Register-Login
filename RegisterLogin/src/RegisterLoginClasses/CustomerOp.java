package RegisterLoginClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerOp implements CustomerDAO {

	@Override
	public int insertData(Customer custom) {
		int status = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		DBConnection db = new DBConnection();
		String sql = "insert into customer values(?,?,?,?)";
		try {
			db.loadDriver();
			conn = db.getConn();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, custom.getUserName());
			ps.setString(2, custom.getPassWord());
			ps.setString(3, custom.getEmail());
			ps.setString(4, custom.getPhoneNo());
			status = ps.executeUpdate();
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Customer getCustomer(String user, String pass) {
		Customer cust = new Customer();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		DBConnection db = new DBConnection();
		String sql = "Select * from customer where username=? and password=?";
		
		try {
			db.loadDriver();
			conn = db.getConn();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, user);
			ps.setString(2, pass);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				cust.setUserName(rs.getString(1));
				cust.setPassWord(rs.getString(2));
				cust.setEmail(rs.getString(3));
				cust.setPhoneNo(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cust;
	}

}
