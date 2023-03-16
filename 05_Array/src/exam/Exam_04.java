package exam;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 4자리 숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println();
		System.out.println("입력받은 숫자 ==> " + num);
		
		int num_5000 = num / 5000;
		num %= 5000;
		int num_1000 = num / 1000;
		num %= 1000;
		int num_500 = num / 500;
		num %= 500;
		int num_100 = num / 100;
		num %= 100;
		int num_50 = num / 50;
		num %= 50;
		int num_10 = num / 10;
		num %= 10;
		int num_1 = num / 1;

		System.out.println("오천원 지폐 : " + num_5000 + "장");
		System.out.println("천원 지폐 : " + num_1000 + "장");
		System.out.println("오백원 동전 : " + num_500 + "개");
		System.out.println("백원 동전 : " + num_100 + "개");
		System.out.println("오십원 동전 : " + num_50 + "개");
		System.out.println("십원 동전 : " + num_10 + "개");
		System.out.println("일원 동전 : " + num_1 + "개");
		
		sc.close();
	}
}