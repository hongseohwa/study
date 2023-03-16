package classes;

public class Person_03 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.personInfo();
		System.out.println();
		
		person.name = "홍길동";
		person.age = 27;
		person.marriage = true;
		person.personInfo();
		
	}
}