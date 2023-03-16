package exam;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 성별(male/female), 나이를 입력하세요.");
		Person person = new Person(sc.next(), sc.next(), sc.nextInt());
		person.print();
		sc.close();
	}
}