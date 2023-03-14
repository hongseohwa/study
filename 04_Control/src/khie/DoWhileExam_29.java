package khie;

/*
 * do ~ while 반복문
 * - 먼저 반복 실행문을 실행하고 조건식을 비교함.
 * 
 * 형식)
 *   do {
 *       반복 실행 문장;
 *   } while(조건식);
 */

public class DoWhileExam_29 {

	public static void main(String[] args) {

		// 1 ~ 10까지 화면에 출력해 보자.
		int num = 1; // 반복문에서의 초기식
		
		do {
			System.out.println("num >>> " + num); // 반복 실행 문장
			num++; // 반복문에서의 증감식
		} while(num <= 10); // 반복문에서의 조건식
		
		System.out.println();
		
		// while 문을 이용하여 1 ~ 10까지 화면에 출력해 보자.
		int su = 1;
		
		while (su <= 10) {
			System.out.println("su >>> " + su);
			su++;
		}
	}
}