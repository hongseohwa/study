package khie;

import java.util.Scanner; // 외부에 있는 클래스를 사용하려고 import 사용(다른 패키지)

/*
 * 키보드로 입력 받은 정수값이 음수이면 "입력받은 정수는 음수입니다." 라는 메세지를 콘솔(화면)에 출력해 보자.
 */

public class IfExam_04 {

	public static void main(String[] args) {
		
		// 키보드로 입력받는 방법
		// 키보드로 입력받기 위한 준비 작업.
		// System.in 표준입력장치(키보드)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요. : ");
		
		int su = sc.nextInt();
		
		// 입력받은 정수가 음수인지 조건식을 이용하여 판별을 하자.
		if (su < 0) {
			System.out.println("입력받은 " + su + " 는 음수입니다.");
		}
		
		// Scanner를 이용하면 반드시 종료를 시키자.
		sc.close();
	}
}