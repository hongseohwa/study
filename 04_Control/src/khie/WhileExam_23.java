package khie;

/*
 * [문제] 1 ~ 100 까지의 홀수의 합과 짝수의 합을 구하여 화면에 보여주세요.
 */

public class WhileExam_23 {

	public static void main(String[] args) {
		
		// while 문에서의 초기식
		int num = 1;
		
		// 홀수의 합 변수, 짝수의 합 변수 선언
		int oddSum = 0, evenSum = 0;
		
		while (num <= 100) {
			if (num % 2 != 0) {
				
				// 참인 경우 - 홀수인 경우
				oddSum += num;
			} else {
				
				// 거짓인 경우 - 짝수인 경우
				evenSum += num;
			}
			num++;
		}
		
		System.out.println("홀수합 >>> " + oddSum);
		System.out.println("짝수합 >>> " + evenSum);
	}
}