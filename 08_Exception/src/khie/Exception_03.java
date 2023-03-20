package khie;

import java.util.Scanner;

public class Exception_03 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int su = sc.nextInt();
		
		System.out.println("입력 받은 수 >>> " + su);
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}