package exam;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		System.out.println();
		
		if (num > 0) {
			System.out.println("입력받은 정수 ==> " + num);
			System.out.println(num + "의 제곱근 ==> " + num * num);
			System.out.println(num + "의 세제곱근 ==> " + num * num * num);
		} else {
			System.out.println("양수를 입력해 주세요.");
		}
		
		sc.close();
	}
}