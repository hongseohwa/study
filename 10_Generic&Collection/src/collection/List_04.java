package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Member;

/*
 * ★★★★★★★★★★★★★★★
 */

public class List_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Member> list = new ArrayList<Member>();
		
		System.out.print("회원 수를 입력하세요. : ");
		int memberCount = sc.nextInt();
		
		// 1. 키보드로 회원의 수만큼 회원 정보를 입력받아서 ArrayList에 저장해 보자.
		for(int i = 0; i < memberCount; i++) {
			System.out.println((i + 1) + "번째 회원의 아이디, 비밀번호, 이름, 나이, 연락처, 주소를 입력하세요.");
			Member member = new Member(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next());
			
			list.add(member);
			System.out.println("------------------------------------------");
		} // for문 end
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list [" + i + "] >>> " + list.get(i));
		}
		
		System.out.println();
		
		// 실제로 입력한 Member 객체의 회원 정보를 화면에 출력해 보자.
		for(int i = 0; i < list.size(); i++) {
			Member dto = list.get(i); // 아주 중요함.
			System.out.println(dto.getId() + "\t" + dto.getPwd() + "\t" + dto.getName() + "\t" + dto.getAge() + "\t" + dto.getPhone() + "\t" + dto.getAddress());
			System.out.println("------------------------------------------");
		}
		
		sc.close();
	}
}