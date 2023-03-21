package object;

/*
 * toString() 메서드 재정의
 * - Object 클래스에서 상속을 받은 메서드를 유용한 정보가 반환이 되도록 재정의.
 * - 해당 클래스의 멤버변수가 정보를 가지고 있는데 가지고 있는 데이터에 올바른 값이 담겼는지,
 *   혹은 틀린 데이터가 담겼는지 확인을 하고 싶은 경우에 toString() 메서드를 재정의하여 값을 확인할 수 있음.
 */

public class Student {
	
	// 멤버변수
	String name;
	String hakbun;
	String major;
	String phone;
	String addr;
	
	public Student() { } // 기본 생성자.
	
	public Student(String name, String hakbun, String major, String phone, String addr) { // 인자 생성자
		
		this.name = name;
		this.hakbun = hakbun;
		this.major = major;
		this.phone = phone;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", major=" + major + ", phone=" + phone + ", addr="
				+ addr + "]";
	}
	
	// 학생 정보를 출력하는 메서드
//	void getStudentInfo() {
//		System.out.println("학생 이름 >>> " + name);
//		System.out.println("학생 학번 >>> " + hakbun);
//		System.out.println("학생 학과 >>> " + major);
//		System.out.println("학생 연락처 >>> " + phone);
//		System.out.println("학생 주소 >>> " + addr);
//	}
	
	
}