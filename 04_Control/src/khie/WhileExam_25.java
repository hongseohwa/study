package khie;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력 받은 수까지의 홀수의 합과 짝수의 합을 구하여 화면에 보여주세요.
 * (while 반복문을 이용할 것)
 */

public class WhileExam_25 {

	public static void main(String[] args) {
		
		int oddSum = 0, evenSum = 0;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		while (i <= num) {
			if (i % 2 != 0) {
				
				// 참인 경우 - 홀수인 경우
				oddSum += i;
			} else {
				
				// 거짓인 경우 - 짝수인 경우
				evenSum += i;
			}
			i++;
		}
		System.out.println("홀수 합 >>> " + oddSum);
		System.out.println("짝수 합 >>> " + evenSum);
		
		sc.close();
	}
}