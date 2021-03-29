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

public class BoardDao {
	private static BoardDao boardDao = null;
	private DataSource ds= null;
	
	public boolean insertBoard(BoardDto boardDto) {
		String sql = 
				"INSERT INTO m1board (no, title,name,password,content)"+
				"VALUES(m1board_seq.nextval,?,?,?,?)";
		
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDto.getTitle());
			pstmt.setString(2, boardDto.getName());
			pstmt.setString(3, boardDto.getPassword());
			pstmt.setString(4, boardDto.getContent());
			pstmt.executeUpdate();
			
			result=true;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(result){
				dbClose(conn, pstmt);
//			dbClose(conn, pstmt, rs);
			}
		}
		return true;
	}


	
	public List<BoardDto> getBoardList(){

		String sql = "SELECT no" + 
		                   ",title" + 
				           ",name" + 
		                   ",to_char(writer,'YYYY-MM-DD') writer" + 
				           ",reader"+ 
		              " FROM m1board" + 
				     " ORDER BY no DESC";
		
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardDto> list = new ArrayList<>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDto boardDto = new BoardDto();
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setName(rs.getString("name"));
				boardDto.setWriter(rs.getString("writer"));
				boardDto.setReader(rs.getInt("reader"));

				list.add(boardDto);
			}
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (result) {
				dbClose(conn, pstmt, rs);
//				dbClose(conn, pstmt);
			}
		}
		
		return list;
	}
	
	public boolean updateBoard(BoardDto boardDto) {
		String sql = 
				"UPDATE m1board "+
				"SET title=?"
				+ " ,name=?"
				+ " ,content=? "+
			  "WHERE no = ? AND password= ?";
		
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDto.getTitle());
			pstmt.setString(2, boardDto.getName());
			pstmt.setString(3, boardDto.getContent());
			pstmt.setLong(4, boardDto.getNo());
			pstmt.setString(5, boardDto.getPassword());
			
			if(pstmt.executeUpdate()>0) {
				result=true;				
			};
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbClose(conn, pstmt);
		}
		return result;
	}
	
	public boolean deleteBoard(BoardDto boardDto) {
		String sql = 
				"DELETE FROM m1board "+
			     "WHERE no = ? AND password= ?";
		
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, boardDto.getNo());
			pstmt.setString(2, boardDto.getPassword());
			
			if(pstmt.executeUpdate()>0) {
				result=true;				
			};
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbClose(conn, pstmt);
		}
		return result;
	}
	
	
	public BoardDto getBoardView(Long no) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDto boardDto = null;
		
		String sql = "SELECT no"+ 
						    ",title"+
					    	",name"+
						    ",content"+
					    	",writer"+
						    ",reader"+
				       " FROM m1board"+
					  " WHERE no = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				boardDto = new BoardDto();
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setName(rs.getString("name"));
				boardDto.setContent(rs.getString("content"));
				boardDto.setWriter(rs.getString("writer"));
				boardDto.setReader(rs.getInt("reader"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbClose(conn, pstmt, rs);
		}
		return boardDto;
	}
	/*
	 * 조회수 증가
	 */
	public boolean updateReader(long no) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		String sql =
				"UPDATE m1board "+
				   "SET reader = reader+1 "+
				 "WHERE no = ?";
		boolean result = false;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, no);
			if(pstmt.executeUpdate()>0) result=true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			dbClose(conn, pstmt);
			
		}
		return result;
	}
	
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
	
	
	
	public static BoardDao getInstance() {
		if(boardDao == null)
			boardDao = new BoardDao();
		return boardDao;
	}
	
	private BoardDao(){
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
