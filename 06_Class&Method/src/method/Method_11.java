package method;

import java.util.Scanner;

// 개인별 성적 처리 - 무한 반복

public class Method_11 {
	
	public static int total(int k, int e, int m) {
		return k + e + m;
	}
	
	public static double average(int tot) {
		return tot / 3.0;
	}
	
	public static String hakjum(double avg) {
		
		if (avg >= 90) {
			if (avg >= 95) {
				return "A+학점";
			} else {
				return "A학점";
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				return "B+학점";
			} else {
				return "B학점";
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				return "C+학점";
			} else {
				return "C학점";
			}
		} else if (avg >= 60) { 
			if (avg >= 65) {
				return "D+학점";
			} else {
				return "D학점";
			}
		} else {
			return "F학점";
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// for문 무한반복 : for(;;) {
		//                   반복 실행 문장;
		//                }
//		for (;;) {
//			System.out.print("학생의 이름을 입력하세요 : ");
//			String name = sc.next();
//			System.out.print("국어 점수 입력 : ");
//			int kor = sc.nextInt();
//			System.out.print("영어 점수 입력 : ");
//			int eng = sc.nextInt();
//			System.out.print("수학 점수 입력 : ");
//			int mat = sc.nextInt();
//			
//			int sum = total(kor, eng, mat);
//			double avg = average(sum);
//			String grade = hakjum(avg);
//			
//			System.out.println();
//			System.out.println("이   름 : " + name);
//			System.out.println("국어점수 : " + kor + "점");
//			System.out.println("영어점수 : " + eng + "점");
//			System.out.println("수학점수 : " + mat + "점");
//			System.out.println("총   점 : " + sum);
//			System.out.printf("평   균 : %.2f%n", avg);
//			System.out.println("학   점 : " + grade);
//			System.out.println();
//		}
		
		// while 반복문에서의 무한 반복
		while (true) {
			System.out.print("학생의 이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("국어 점수 입력 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			int mat = sc.nextInt();
			
			int sum = total(kor, eng, mat);
			double avg = average(sum);
			String grade = hakjum(avg);
			
			System.out.println();
			System.out.println("이   름 : " + name);
			System.out.println("국어점수 : " + kor + "점");
			System.out.println("영어점수 : " + eng + "점");
			System.out.println("수학점수 : " + mat + "점");
			System.out.println("총   점 : " + sum);
			System.out.printf("평   균 : %.2f%n", avg);
			System.out.println("학   점 : " + grade);
			System.out.println();
			
			// 계속 진행할지, 종료를 할지 여부를 물어본다.
			System.out.print("계속 진행 할까요?(Y : 계속 / N : 종료) : ");
			if (sc.next().equalsIgnoreCase("N")) {
				break;
			}
			
		} // while 반복문 end
		
		System.out.println("수고하셨습니다.");
		
		sc.close();
	}
}