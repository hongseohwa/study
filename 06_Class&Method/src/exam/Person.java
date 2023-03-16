package exam;

public class Person {
	String name;
	String mf;
	int age;
	
	public Person() {}
	
	public Person(String name, String mf, int age) {
		this.name = name;
		this.mf = mf;
		this.age = age;
	}
	
	void print() {
		System.out.println("---------------------");
		System.out.println("이름 : " + name);
		if (mf.equalsIgnoreCase("male")) {
			System.out.println("성별 : 남자");
		} else {
			System.out.println("성별 : 여자");
		}
		System.out.println("나이 : " + age + "세");
	}
}