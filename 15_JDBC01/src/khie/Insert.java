package khie;

import java.sql.*;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		// 오라클 데이터베이스와 연결하는 객체.
		Connection con = null;
		
		// SQL문을 데이터베이스에 전송하는 객체.
		PreparedStatement pstmt = null;
		
		// SQL문을 실행한 후에 결과값을 가지고 있는 객체.		
//		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "web";
		String password = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		String hakbun = sc.nextLine();
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("학과 입력 : ");
		String major = sc.nextLine();
		
		System.out.print("연락처 입력 : ");
		String phone = sc.nextLine();
		
		System.out.print("주소 입력 : ");
		String address = sc.nextLine();
		
		try {
			// 1단계 : 오라클 드라이버를 동적으로 로딩 
			// ==> 동적 로딩 : 프로그램을 실행할 때에 오라클 드라이버를 로딩한다는 의미.
			Class.forName(driver);
			
			// 2단계 : 오라클 데이터베이스와 연결 시도(진행)
			con = DriverManager.getConnection(url, user, password);
			
			// 3단게 : 데이터베이스에 SQL문을 전송하기 위한 쿼리문 작성.
			String sql = "insert into student values(?, ?, ?, ?, ?, sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hakbun);
			pstmt.setString(2, name);
			pstmt.setString(3, major);
			pstmt.setString(4, phone);
			pstmt.setString(5, address);
			
			// 4단계 : 데이터베이스에 SQL문을 전송 및 실행.
			/*
			 * - sql문이 select 쿼리문인 경우에는 executeQuery() 메서드를 이용해야 함.
			 * ==> 반환형은 ResultSet 타입으로 반환.
			 * - sql문이 insert, update, delete 쿼리문인 경우에는 executeUpdate() 메서드를 이용해야 함.
			 * ==> 반환형은 int 타입으로 반환.
			 */
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("학생 추가 성공");
			} else {
				System.out.println("학생 추가 실패");
			}
			
			// 6단계 : 연결되어 있는 자원을 종료 시키자
			pstmt.close();
			con.close();
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}