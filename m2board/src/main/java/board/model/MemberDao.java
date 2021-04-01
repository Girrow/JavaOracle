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

import org.apache.commons.codec.digest.DigestUtils;

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

	public List<ZipcodeDto> searchZipcode(String area) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ZipcodeDto> zipcodeList = new ArrayList<ZipcodeDto>();
		String sql = "select substr(zipcode, 1, 3) as zipcode1, "
				+ " 	   substr(zipcode, 5, 3) as zipcode2, "
				+ " 	   sido || ' ' || gugun || ' ' || dong || ' ' || "
				+ " 	   ri || ' ' || bunji as address1 "
				+ "from zipcode "
				+ "where dong like '%' || ? || '%'";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, area);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ZipcodeDto zipcodeDto = new ZipcodeDto();
				zipcodeDto.setZipcode1(rs.getString("zipcode1"));
				zipcodeDto.setZipcode2(rs.getString("zipcode2"));
				zipcodeDto.setAddress1(rs.getString("address1"));
				zipcodeList.add(zipcodeDto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(conn, pstmt, rs);
		}
		
		return zipcodeList;
	}

	public int checkID(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		String sql = "SELECT count(*) as cnt "
				+ "     FROM tbl_member "
				+ "    WHERE id = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt("cnt");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			result = -1;
		}finally {
			dbClose(conn, pstmt, rs);
		}
		return result;
	}

	public boolean registerMember(MemberDto memberDto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean result = false;
		String sql = "INSERT INTO tbl_member(id,password,name,birth,phone,zipcode,address1,address2) VALUES(?,?,?,?,?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberDto.getId());
			pstmt.setString(2, memberDto.getPassword());
			pstmt.setString(3, memberDto.getName());
			pstmt.setString(4, memberDto.getBirth());
			pstmt.setString(5, memberDto.getPhone());
			pstmt.setString(6, memberDto.getZipcode());
			pstmt.setString(7, memberDto.getAddress1());
			pstmt.setString(8, memberDto.getAddress2());
			pstmt.executeUpdate();
			
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}finally {
			dbClose(conn, pstmt);
		}
		return result;
		
	}

	public MemberDto getUser(MemberDto memberDto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto userInfo = null;
		String sql = "SELECT id, name "
				+ "     FROM tbl_member "
				+ "    WHERE id=? and password=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberDto.getId());
			pstmt.setString(2, memberDto.getPassword() );
			rs = pstmt.executeQuery();
			if(rs.next()) {
				userInfo = new MemberDto();
				userInfo.setId(rs.getString("id"));
				userInfo.setName(rs.getString("name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(conn, pstmt, rs);
		}
		return userInfo;
	}

	public boolean insertWrite(BoardDto boardDto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean result = false;
		String sql = "INSERT INTO tbl_board(no,title,content,id) VALUES(seq_board.nextval,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDto.getTitle());
			pstmt.setString(2, boardDto.getContent());
			pstmt.setString(3, boardDto.getMemberDto().getId());
			pstmt.executeUpdate();
			
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}finally {
			dbClose(conn, pstmt);
		}
		return result;
	}
}
