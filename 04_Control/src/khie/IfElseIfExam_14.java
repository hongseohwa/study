package khie;

import java.util.Scanner;

/*
 * [문제2] 이름과 국어점수, 영어점수, 수학점수, 자바점수를 키보드로 입력을 받아서 성적을 처리해 보세요.
 * 각 과목의 점수와 총점, 평균, 학점을 화면에 출력해 주세요.
 */

public class IfElseIfExam_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 국어점수 영어점수 수학점수 자바점수 순으로 띄어쓰기를 사용하여 입력해주세요 : ");
		String name = sc.next();
		int kScore = sc.nextInt();
		int eScore = sc.nextInt();
		int mScore = sc.nextInt();
		int jScore = sc.nextInt();
		
		String grade;
		int sum = kScore + eScore + mScore + jScore;
		double avg = sum / 4.0;
		
		if (avg >= 90) {
			grade = "A학점";
		} else if (avg >= 80) {
			grade = "B학점";
		} else if (avg >= 70) {
			grade = "C학점";
		} else if (avg >= 60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		
		System.out.println(name + "님의 각 과목의 점수는 국어점수 : " + kScore + "점, 영어점수 : " + eScore + "점, 수학점수 : " + mScore + "점, 자바점수 : " + jScore + "점 입니다.");
		System.out.println(name + "님의 총점은 " + sum + "점이고 평균은 " + avg + "이며 이에 따른 학점은 " + grade + "입니다.");
		
		sc.close();
	}
}