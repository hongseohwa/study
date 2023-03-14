package khie;

public class IfExam_02 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		// 1. 키보드로부터 점수를 입력을 받아 변수에 저장하자
		int jumsu = Integer.parseInt(args[0]);
		
		// 2. 조건식을 통해 원하는 결과를 화면에 출력하자.
		if (jumsu >= 90) {			
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("A학점 입니다.");
		}
		
		System.out.println("프로그램 종료");
	
	}
}