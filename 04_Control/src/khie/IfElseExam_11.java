package khie;

import java.util.Scanner;

// 성별 확인 문제

public class IfElseExam_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		 방법 1
		System.out.print("성별 입력(M : 남성 / F : 여성) : ");
		String gender = sc.next();
		
		if (gender.equalsIgnoreCase("F")) {
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성입니다.");
		}
		
//		// 방법 2
//		System.out.print("성별 입력(M : 남성 / F : 여성) : ");
//		String gender = sc.next();
//		
//		char c = gender.charAt(0);
//		
//		if ( c == 'F') {
//			System.out.println("여성입니다.");
//		} else {
//			System.out.println("남성입니다.");
//		}
//		
		sc.close();
	}
}