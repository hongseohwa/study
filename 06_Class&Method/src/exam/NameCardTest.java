package exam;

import java.util.Scanner;

public class NameCardTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요.");
		NameCard nameCard = new NameCard(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		nameCard.print();
		sc.close();	
	}
}