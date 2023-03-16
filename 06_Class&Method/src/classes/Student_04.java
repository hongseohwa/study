package classes;

public class Student_04 {

	public static void main(String[] args) {
		
		// 기본 생성자로 객체를 생성.
		Student student = new Student();
		
		student.hakbun = 2023001;
		student.name = "홍길동";
		student.major = "경제학과";
		student.phone = "010-1111-1234";
		student.addr = "서울시 남대문로";
		
		student.getStudentInfo();
		System.out.println();
		
		// 인자 생성자로 객체를 생성.
		Student student2 = new Student(2023002, "유관순", "유아교육학과", "010-2222-2345", "충남 천안시");
		student2.getStudentInfo();
		
	}
}