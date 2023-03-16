package exam;

import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("지방의 그램을 입력하세요 : ");
		int fat = sc.nextInt();
		
		System.out.print("탄수화물의 그램을 입력하세요 : ");
		int carbohydrate = sc.nextInt();
		
		System.out.print("단백질의 그램을 입력하세요 : ");
		int protein = sc.nextInt();
		
		int sumcal = (fat * 9) + (carbohydrate * 4) + (protein * 4);
		System.out.printf("총칼로리 : %,d cal\n", sumcal);
		
		sc.close();
	}
}