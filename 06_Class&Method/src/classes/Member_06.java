package classes;

import java.util.Scanner;

public class Member_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원님의 아이디, 이름, 나이, 연락처, 직업을 입력하세요. ");
		
		Member member = new Member(sc.next(), sc.next(), Integer.parseInt(sc.next()), sc.next(), sc.next());
		System.out.println();
		member.getMember();
		sc.close();
	}
}