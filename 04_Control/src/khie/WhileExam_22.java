package khie;

// while 반복문을 이용하여 1 ~ 10까지의 합을 구해 보자.

public class WhileExam_22 {

	public static void main(String[] args) {
		
		// 1. 변수 설정
		int su = 1; // 반복문에서의 초기식
		int sum = 0; // 1 ~ 10 까지의 합을 저장할 변수
		
		// 2. 반복하여 합을 저장하자
		while (su <= 10) {
			sum += su;
			su++;
		}
		
		System.out.println("1 ~ 10 까지의 합 >>> " + sum);
	}
}