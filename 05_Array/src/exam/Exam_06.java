package exam;

import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		int oddSum = 0, evenSum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		
		System.out.println("홀수합계 : " + oddSum);
		System.out.println("짝수합계 : " + evenSum);
		
		sc.close();
	}
}