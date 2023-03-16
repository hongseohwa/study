package exam;

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");
		
		// 1. 학생 이름, 국어점수, 영어점수, 수학점수, 총점, 평균, 학점, 순위 배열이 필요함
//		int studentCount = sc.nextInt();
		String[] name = new String[sc.nextInt()];
		int[] kor = new int[name.length];
		int[] eng = new int[kor.length];
		int[] mat = new int[eng.length];
		int[] sum = new int[mat.length];
		double[] avg = new double[sum.length];
		String[] grade = new String[avg.length];
		int[] rank = new int[grade.length];
		
		// 2. 학생 수 만큼 이름, 국어점수, 영어점수, 수학점수를 키보드로 입력을 받아서 각각의 배열에 저장해 주자.
		for (int i = 0; i < name.length; i++) {
			
			// 이름과 각 과목의 점수를 배열에 저장을 하자.
			System.out.print("이름을 입력하세요. : ");
			name[i] = sc.next();
			
			System.out.print("국어 점수 입력 : ");
			kor[i] = sc.nextInt();
			
			System.out.print("영어 점수 입력 : ");
			eng[i] = sc.nextInt();
			
			System.out.print("수학 점수 입력 : ");
			mat[i] = sc.nextInt();
			
			// 총점과 평균 그리고 학점을 구하자.
			
			// 총점을 구하자.
			sum[i] = kor[i] + eng[i] + mat[i];
			
			// 평균을 구하자.
			avg[i] = sum[i] / 3.0;
			
			// 학점을 구하자.
			if (avg[i] >= 90) {
				grade[i] = "A학점";
			} else if (avg[i] >= 80) {
				grade[i] = "B학점";
			} else if (avg[i] >= 70) {
				grade[i] = "C학점";
			} else if (avg[i] >= 60) {
				grade[i] = "D학점";
			} else {
				grade[i] = "F학점";
			}
			
			// 마지막으로 석차를 구하자.
			// 모든 학생은 본인이 1등이라고 생각한다.
			rank[i] = 1;
		} // for문 end
		
		// 실제로 석차를 구해 보자.
		for (int i = 0; i < name.length; i++) {
			for (int j = i+1; j < name.length; j++) {
				if (sum[j] > sum[i]) {
					rank[i]++;
				}
			}
		}
		
		// 마지막으로 성적을 화면에 출력해 보자.
		for (int i = 0; i < name.length; i++) {
			System.out.println("::::::::::::::::::::::::");
			System.out.print("이 름 : " + name[i] + "\t");
			System.out.print("총 점 : " + sum[i] + "\t");
			System.out.printf("평 균 : %.2f점\t", avg[i]);
			System.out.print("학 점 : " + grade[i] + "\t");
			System.out.print("석 차 : " + rank[i] + "\t");
			System.out.println();
		}
		
		sc.close();
	}
}