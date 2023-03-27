package khie;

import java.sql.*;

import model.StudentDTO;
public class SelectOne {

	public StudentDTO selectOne(String hakbun) {
		// 오라클 데이터베이스와 연결하는 객체.
		Connection con = null;
		
		// SQL문을 데이터베이스에 전송하는 객체.
		PreparedStatement pstmt = null;
		
		// SQL문을 실행한 후에 결과값을 가지고 있는 객체.
		ResultSet rs = null;
		
		StudentDTO dto = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "web";
		String password = "1234";
		
		// 1단계 : 오라클 데이터베이스 드라이버를 로딩.
		try {
			Class.forName(driver);
			
			// 2단계 : 오라클 데이터베이스와 연결 진행.
			con = DriverManager.getConnection(url, user, password);
			
			// 3단계 : 데이터베이스에 SQL문을 전송하기 위한 쿼리문 작성.
			String sql = "select * from student where hakbun = ?";
			pstmt = con.prepareCall(sql);
			pstmt.setString(1, hakbun);
			
			// 4단계 : 데이터베이스에 SQL문을 전송 및 실행.
			rs = pstmt.executeQuery();
			
			// 5단계 : 데이터를 가져와서 출력.
			if(rs.next()) {
				dto = new StudentDTO();
				dto.setHakbun(rs.getString("hakbun"));
				dto.setName(rs.getString("name1"));
				dto.setMajor(rs.getString("major"));
				dto.setPhone(rs.getString("phone"));
				dto.setAddress(rs.getString("addr"));
				dto.setRegdate(rs.getNString("regdate"));
			}
			
			// 6단계 : 사용된 자원 종료하기
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}
}