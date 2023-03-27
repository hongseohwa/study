package khie;

import java.sql.*;

public class Select {
	public static void main(String[] args) {
		
		// 오라클 데이터베이스와 연결하는 객체.
		Connection con = null;
		
		// SQL문을 데이터베이스에 전송하는 객체.
		PreparedStatement pstmt = null;
		
		// SQL문을 실행한 후에 결과값을 가지고 있는 객체.
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "web";
		String password = "1234";
		
		try {
			
			// 1단계 : 오라클 드라이버를 동적으로 로딩 
			// ==> 동적 로딩 : 프로그램을 실행할 때에 오라클 드라이버를 로딩한다는 의미.
			Class.forName(driver);
			
			System.out.println("오라클 드라이버 로딩 성공");
			
			// 2단계 : 오라클 데이터베이스와 연결 시도(진행)
			con = DriverManager.getConnection(url, user, password);
			if(con != null) {
				System.out.println("오라클 데이터베이스와 연결 성공");
			}
			
			// 3단게 : 데이터베이스에 SQL문을 전송하기 위한 쿼리문 작성.
			String sql = "select * from student order by hakbun desc";
			pstmt = con.prepareStatement(sql);
			
			// 4단계 : 데이터베이스에 SQL문을 전송 및 실행.
			// ResultSet 객체는 select 쿼리문의 결과를 저장하는 객체.
			rs = pstmt.executeQuery();
			
			// 5단계 : 데이터를 가져와서 출력
			while(rs.next()) {
				String hakbun = rs.getString("hakbun");
				String name = rs.getString("name1");
				String major = rs.getString("major");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				String regdate = rs.getString("regdate").substring(0, 10);
				System.out.println(hakbun + "\t" + name + "\t" + major + "\t" + phone + "\t" + addr + "\t" + regdate + "\t");
			}
			
			// 6단계 : 연결되어 있던 객체를 종료시켜 주자.
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}