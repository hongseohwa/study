package khie;

import java.util.Scanner;

/*
 * [문제2] 키보드로 입력 받은 정수가 홀수인지 짝수인지 판별하여 화면에 출력해 보세요.
 */

public class IfElseExam_08 {

	public static void main(String[] args) {
		
		// 1. 키보드 입력 준비 작업
		Scanner sc = new Scanner(System.in);
		
		// 2. 키보드로부터 정수를 입력을 받자.
		System.out.print("정수를 입력하세요. : ");
		int su = sc.nextInt();
		
		// 3. 조건문을 만들어 보자.
		if ((su % 2) != 0) {
			
			// 4. 짝수인 경우 출력문
			System.out.println("입력 받은 " + su + "은(는) 홀수입니다.");
		} else {
			
			// 5. 홀수인 경우 출력문
			System.out.println("입력 받은 " + su + "은(는) 짝수입니다.");
		}
		
		// 6. Scanner 종료
		sc.close();
	}
}