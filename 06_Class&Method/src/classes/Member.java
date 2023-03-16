package classes;

/*
 * [문제] Member 라는 클래스를 만들어서 해당 Member 클래스의 회원 정보를 화면에 보여주세요.
 * (단, 회원의 정보는 회원 아이디, 회원 이름, 회원 나이, 회원 연락처, 회원 직업으로 구성을 한다)
 */

public class Member {
	
	String id;
	String name;
	int age;
	String phone;
	String job;
	
	public Member() {}
	
	public Member(String i, String n, int a, String p, String j) {
		id = i;
		name = n;
		age = a;
		phone = p;
		job = j;
	}
	
	void getMember() {
		System.out.println("회원 아이디 : " + id);
		System.out.println("회원 이름 : " + name);
		System.out.println("회원 나이 : " + age);
		System.out.println("회원 연락처 : " + phone);
		System.out.println("회원 직업 : " + job);
	}
}
