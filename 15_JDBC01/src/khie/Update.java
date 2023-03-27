package khie;

import java.sql.*;
import java.util.Scanner;

public class Update {
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
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 학번 입력 : ");
		String hakbun = sc.nextLine();
		
		System.out.print("수정할 학과 입력 : ");
		String major = sc.nextLine();
		
		System.out.print("수정할 연락처 입력 : ");
		String phone = sc.nextLine();
		
		System.out.print("수정할 주소 입력 : ");
		String address = sc.nextLine();
		
		try {
			// 1단계 : 오라클 드라이버 동적으로 로딩.
			Class.forName(driver);
			
			// 2단계 : 오라클 데이터베이스와 연결 진행.
			con = DriverManager.getConnection(url, user, password);
			
			// 3단계 : 데이터베이스에 전송할 SQL문 작성.
			String sql = "update student set major  = ?, phone = ?, addr = ? where hakbun = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, major);
			pstmt.setString(2, phone);
			pstmt.setString(3, address);
			pstmt.setString(4, hakbun);
			
			// 4단계 : 데이터베이스에 SQL문을 전송 및 실행.
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("학생 정보 수정 완료");
			} else {
				System.out.println("학생 정보 수정 실패");
			}
			
			// 5단계 : 연결되어 있던 자원 종료하기.
			pstmt.close();
			con.close();
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}