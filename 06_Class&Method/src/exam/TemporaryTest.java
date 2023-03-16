package exam;

import java.util.Scanner;

public class TemporaryTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
		Temporary temporary = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
		temporary.print();
		sc.close();
	}
}