package exam;

import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 : ");
		int[] arr = new int[sc.nextInt()];
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + " 번째 값 입력 : ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("max : " + arr[0] + ", min : " + arr[arr.length - 1]);
		
		sc.close();
	}
}