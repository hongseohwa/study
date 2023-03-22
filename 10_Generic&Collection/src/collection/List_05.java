package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;

/*
 * [문제] List_04 클래스처럼 Student 객체를 만들어서 키보드로 학생 수를 입력받고, 
 *       입력받은 학생 수 만큼의 학생 정보를 키보드로 입력을 받아 ArrayList에 저장 후 화면에 출력해 보세요.
 *       (조건 - 학생의 정보는 학번, 이름, 학과, 연락처, 주소)
 */

public class List_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		
		System.out.print("학생 수를 입력하세요. : ");
		int studentCount = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < studentCount; i++) {
			System.out.println("학생의 학번, 이름, 학과, 연락처, 주소를 입력하세요.");
//			Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			
			list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
			System.out.println();
		}
		
		for(int i = 0; i < list.size(); i++) {
			Student studentInfo = list.get(i);
			System.out.println(studentInfo.getHakbun() + "\t" + studentInfo.getName() + "\t" + studentInfo.getMajor() + "\t" + studentInfo.getPhone() + "\t" + studentInfo.getAddress());
			System.out.println();
		}
		
		sc.close();
	}
}