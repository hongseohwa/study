package khie;

import java.util.Scanner;

/*
 * switch ~ case 문 - 분기문(조건문)
 * - 식(정수 또는 char)을 사용해서 여러 개의 조건 중 하나를 선택하는 명령문.
 * - jdk 1.7 버전부터는 식에 String 사용이 가능함.
 * 
 * 형식)
 *   switch(식 또는 값 또는 변수) {
 *       case 값1 :
 *               값이 1일 때 실행문;
 *               break; // switch ~ case 블럭 탈출
 *       case 값2 :
 *               값이 2일 때 실행문;
 *               break; // switch ~ case 블럭 탈출
 *       case 값3 :
 *               값이 3일 때 실행문;
 *               break; // switch ~ case 블럭 탈출        
 *       default :
 *               값1 ~ 값3 이외의 값이 들어온 경우 실행문;
 *               // default 문장은 생략도 가능함.
 *   }
 */

public class SwitchCaseExam_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 3 사이의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		switch (num) {
			case 1 :
				System.out.println("입력 받은 숫자는 1 입니다.");
				break;
			case 2 :
				System.out.println("입력 받은 숫자는 2 입니다.");
				break;
			case 3 :
				System.out.println("입력 받은 숫자는 3 입니다.");
				break;
			default :
				System.out.println("1 ~ 3 이외의 숫자입니다.");
		}
		
		sc.close();
	}
}