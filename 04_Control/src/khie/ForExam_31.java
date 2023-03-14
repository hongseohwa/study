package khie;

/*
 * [문제] for 반복문을 이용하여 1 ~ 100까지의 홀수의 합과 짝수의 합을 구하여 화면에 보여주세요.
 */

public class ForExam_31 {

	public static void main(String[] args) {
		
		int oddSum = 0, evenSum = 0;
		
		for (int su = 1; su <= 100; su++) {
			if (su % 2 != 0) {
				oddSum += su; // oddSum = oddSum + su;
			} else {
				evenSum += su; // evenSum = evenSum + su;
			}
		} // for문 end
		
		System.out.println("홀수의 합 >>> " + oddSum);
		System.out.println("짝수의 합 >>> " + evenSum);
	}
}