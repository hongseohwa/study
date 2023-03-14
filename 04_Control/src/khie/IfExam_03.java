package khie;

/*
 * [문제] 키보드로 입력 받은 정수가 5로 나누어 떨어지면 "이 정수는 5의 배수입니다." 라는 메시지를 콘솔창에 출력해 보세요. 
 */

public class IfExam_03 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		// 1. 키보드로 정수를 입력을 받자.
		int su = Integer.parseInt(args[0]);
		
		// 2. 조건식을 통해서 5의 배수인지 판별을 하자.
		if ((su % 5) == 0) {
			// 화면에 5의 배수이면 출력해 주자.
			System.out.println("이 정수는 5의 배수입니다.");
		}
		
		System.out.println("프로그램 종료");
		
	}
}