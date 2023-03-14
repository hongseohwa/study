package khie;

import java.util.Scanner;

/*
 * [문제] 키보드로부터 입력받은 점수가 60점 이상이면 "합격입니다."라는 메세지를 화면에 출력해 보세요.
 */

public class IfExam_05 {

	public static void main(String[] args) {
		
		// 1. 키보드로부터 점수를 입력을 받자.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. : ");
		
		int jumsu = sc.nextInt();
		
		// 2. 입력받은 점수가 60점 이상인지 조건식을 이용하여 판별을 하자.
		if (jumsu >= 60) {
			System.out.println("합격입니다.");
		}
		
		sc.close();
	}
}