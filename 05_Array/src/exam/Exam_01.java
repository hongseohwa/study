package exam;

import java.util.Scanner;

public class Exam_01 {
	
	public static void main(String[] args) {
		int kscore, escore, mscore, jscore;
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		kscore = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		escore = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		mscore = sc.nextInt();
		System.out.print("자바 점수 입력 : ");
		jscore = sc.nextInt();
		
		sum = kscore + escore + mscore + jscore;
		avg = sum / 4.0;
		
		System.out.println();
		System.out.println("국어점수 : " + kscore + "점");
		System.out.println("영어점수 : " + escore + "점");
		System.out.println("수학점수 : " + mscore + "점");
		System.out.println("자바점수 : " + jscore + "점");
		System.out.println("총   점 : " + sum + "점");
		System.out.printf("평   균 : %.2f점%n", avg);
		
		sc.close();
	}
}
