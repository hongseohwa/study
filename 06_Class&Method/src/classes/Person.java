package classes;

public class Person {
	
	// 멤버변수
	String name;
	int age;
	boolean marriage;
	
	// 멤버메서드
	void personInfo() {
		String marr = " ";
		
		if (marriage) {
			marr = "기혼";
		} else {
			marr = "미혼";
		}
		
	System.out.println("이름 >>> " + name);
	System.out.println("나이 >>> " + age);
	System.out.println("결혼여부 >>> " + marr);
	}
}