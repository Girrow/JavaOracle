package board.model;

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

public class MemberDao {
	private static MemberDao memberDao = null;
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
	
	
	
	public static MemberDao getInstance() {
		if(memberDao == null)
			memberDao = new MemberDao();
		return memberDao;
	}
	
	private MemberDao(){
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
}
