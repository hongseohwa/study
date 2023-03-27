package khie;

import java.sql.*;
import java.util.Scanner;

import model.StudentDTO;

public class Delete {

	public static void main(String[] args) {
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
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 학번 입력 : ");
		String hakbun = sc.next();
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			String sql = "delete from student where hakbun = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hakbun);
			int res = pstmt.executeUpdate();
			if(res > 0) {
				con.commit();
				System.out.println("학생 삭제 성공");
			} else {
				con.rollback();
				System.out.println("학생 삭제 실패");
			}
			pstmt.close();
			con.close();
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}