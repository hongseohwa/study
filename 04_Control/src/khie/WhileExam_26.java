package khie;

import java.util.Scanner;

public class WhileExam_26 {

	public static void main(String[] args) {
		
		int count = 1; // 반복문에서의 초기식
		
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 최대 갯수를 입력하세요. : ");
		int starCount = sc.nextInt();
		
		System.out.println();
		
		while (count <= starCount) {
			System.out.print("*");
			count++;
		}
		
		sc.close();
	}
}