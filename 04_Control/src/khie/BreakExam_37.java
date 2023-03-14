package khie;

/*
 * 1 ~ 100 까지의 합을 구하는데 합이 200이 되는 순간까지만의 합을 구하여 화면에 보여주세요.
 */

public class BreakExam_37 {

	public static void main(String[] args) {
		int sum = 0; // 합을 구하는 변수
		int i = 0; // 전역변수 for문의 int i 는 지역변수라 밖으로 꺼내서 i 출력
		
		for (i = 1; i <= 100; i++) {
			sum += i; // sum = sum + i;
			if (sum >= 200) {
				break;
			}
		} // for문 end
		System.out.println("sum >>> " + sum);
		System.out.println("su >>> " + i);
	}
}