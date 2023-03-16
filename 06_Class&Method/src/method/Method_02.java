package method;

import java.util.Scanner;

public class Method_02 {
	
	public static void total() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			sum += i;
		}
		System.out.println("1부터 " + t + " 까지의 합 >>> " + sum);
		
		sc.close();
	}

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		/*
		 * [문제] 1부터 키보드로 받은 수까지의 합을 구하는 메서드를 호출해보세요...
		 */
		
		total();
		
		System.out.println("프로그램 종료");
		
	}
}