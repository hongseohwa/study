package khie;

import java.util.Scanner;

/*
 * [문제3] 키보드로부터 입력받은 정수가 5의 배수이면 "이 정수는 5의 배수입니다." 라고 화면에 출력을 하고, 그렇지 않으면 "이 정수는 5의 배수가 아닙니다." 라고 화면에 출력해 보자.
 *        단, 입력받은 정수가 음수이면 "음수 값이 입력되었습니다."라고 화면에 출력해 보세요.
 */

public class IfElseExam_09 {

	public static void main(String[] args) {
		
		// 1. 키보드 입력 준비 작업
		Scanner sc = new Scanner(System.in);
		
		// 2. 키보드로부터 정수를 입력을 받자.
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		// 3. 입력받은 정수가 양수인지 음수인지 판별
		if (num > 0) {
			
			// 4. 입력받은 정수가 양수인 경우
			if ((num % 5) == 0) {
				
				// 5. 5의 배수인 경우
				System.out.println("입력 받은 " + num + "은(는) 5의 배수입니다.");
			} else {
				
				// 6. 5의 배수가 아닌 경우
				System.out.println("입력 받은 " + num + "은(는) 5의 배수가 아닙니다.");
			}
		} else {
			
			// 7. 입력받은 정수가 음수인 경우
			System.out.println("음수 값이 입력되었습니다.");
		}
		
		// 8. Scanner 종료
		sc.close();
	}
}