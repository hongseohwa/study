package khie;

import java.util.Scanner;

/*
 * 키보드로 두 수를 입력받아서 그 중에 큰 수를 화면에 출력해 보자.
 */

public class IfElseExam_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int su2 = sc.nextInt();
		
		if (su1 > su2) {
			System.out.println("큰 값은 " + su1 + "입니다.");
		} else {
			System.out.println("큰 값은 " + su2 + "입니다.");
		}
		
		sc.close();
	}
}