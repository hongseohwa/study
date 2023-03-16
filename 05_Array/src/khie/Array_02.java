package khie;

import java.util.Scanner;

/*
 * 5개의 정수를 저장할 배열을 만들고, 키보드로 배열에 데이터를 저장 후 해당 배열을 화면에 출력해 보자.
 */

public class Array_02 {

	public static void main(String[] args) {
		int[] score = new int[5];
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("첫번째 정수 입력 : ");
		// score[0] = sc.nextInt();
		// System.out.print("두번째 정수 입력 : ");
		// score[1] = sc.nextInt();
		// System.out.print("세번째 정수 입력 : ");
		// score[2] = sc.nextInt();
		// System.out.print("네번째 정수 입력 : ");
		// score[3] = sc.nextInt();
		// System.out.print("다섯번째 정수 입력 : ");
		// score[4] = sc.nextInt();
		
		// for 반복문을 이용하여 5개의 정수를 배열에 저장
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 정수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		// 배열에 저장된 데이터를 화면에 출력해 보자.
		for (int i = 0; i < 5; i++) {
			System.out.println("score [" + i + "] >>> " + score[i]);
		}
		
		sc.close();
	}
}