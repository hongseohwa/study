package khie;

/*
 * 아래와 같이 화면에 출력해 보자.
 * 
 *    *****
 *    *****
 *    *****
 *    *****
 *    
 *    *
 *    **
 *    ***
 *    ****
 *    *****
 *    
 *    *****
 *    ****
 *    ***
 *    **
 *    *
 */

public class ForExam_35 {

	public static void main(String[] args) {
		
		// 1번째 별찍기
		for (int i = 1; i <= 4; i++) { // 별찍기에서 행
			for (int j = 1; j <= 5; j++) { // 별찍기에서 열
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// 2번째 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// 3번째 별찍기
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}