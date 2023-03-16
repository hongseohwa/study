package classes;

import java.util.Scanner;

public class Student_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("학생의 학번 입력 : ");
//		int hakbun = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("학생의 이름 입력 : ");
//		String name = sc.nextLine();
//		
//		System.out.print("학생의 학과 입력 : ");
//		String major = sc.nextLine();
//		
//		System.out.print("학생의 연락처 입력 : ");
//		String phone = sc.nextLine();
//		
//		System.out.print("학생의 주소 입력 : ");
//		String addr = sc.nextLine();
		
		System.out.println("학생의 학번, 이름, 학과, 연락처, 주소를 입력하세요. ");
		
		Student student = new Student(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		student.getStudentInfo();
		
		sc.close();
	}
}