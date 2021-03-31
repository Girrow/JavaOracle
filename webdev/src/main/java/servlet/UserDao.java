package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDao {
	private static UserDao userDao = null;
	private DataSource ds= null;
	
	
	private void dbClose(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		dbClose(conn, pstmt);
	}
	
	private void dbClose(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static UserDao getInstance() {
		if(userDao == null)
			userDao = new UserDao();
		return userDao;
	}
	
	private UserDao(){
//		try {Class.forName("oracle.jdbc.OracleDriver");}
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/OracleCP");
			ds.getConnection();
		}catch (Exception e) {e.printStackTrace();}
	}
	
	private Connection getConnection() throws SQLException {
//		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oraclejava", "oraclejava");
		return ds.getConnection();
	}

	public int countId(String id) {
		int cnt = 0;
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		String sql = "SELECT count(id) as cnt "
				+ "     FROM USERID "
				+ "    WHERE id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs =pstmt.executeQuery();
			
			if(rs.next()) cnt = rs.getInt("cnt");
			
		} catch (Exception e) {
			e.printStackTrace();
			cnt=-1;
		}finally {
			dbClose(conn, pstmt, rs);
		}
		return cnt;
	}
}
