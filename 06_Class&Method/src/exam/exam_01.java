package exam;

import java.util.Scanner;

public class exam_01 {
	
	public static void setting(String[] n, int[] sn, String[] m, String[] p, Scanner sc) {

		for (int i = 0; i < n.length; i++) {
			System.out.println((i + 1) + "번째 학생 정보 입력");
			System.out.print("이름 입력 : ");
			n[i] = sc.next();
			
			System.out.print("학번 입력 : ");
			sn[i] = sc.nextInt();
			
			System.out.print("학과 입력 : ");
			m[i] = sc.next();
			
			System.out.print("전화번호 입력 : ");
			p[i] = sc.next();
			System.out.println();
		}
	}
	
	public static void print(String[] n, int[] sn, String[] m, String[] p) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("이름 : " + n[i]);
			System.out.println("학번 : " + sn[i]);
			System.out.println("학과 : " + m[i]);
			System.out.println("전화번호 : " + p[i]);
			System.out.println();
		}
	}
	
	public static void search(String[] n, int[] sn, String[] m, String[] p, Scanner sc) {
		
		System.out.print("학번을 입력해주세요. : ");
		int hakbun = sc.nextInt();
		
		for (int i = 0; i < n.length; i++) {
			if (hakbun == sn[i]) {
				System.out.println("이름 : " + n[i]);
				System.out.println("학번 : " + sn[i]);
				System.out.println("학과 : " + m[i]);
				System.out.println("전화번호 : " + p[i]);
				System.out.println();
			}
		}
	}
	
	public static void change(String[] n, int[] sn, String[] m, String[] p, Scanner sc) {
		
		System.out.print("수정할 학생의 학번을 입력해주세요. : ");
		int hakbun = sc.nextInt();
		
		for (int i = 0; i < n.length; i++) {
			if (hakbun == sn[i]) {
				System.out.print("학과를 수정해주세요. : ");
				m[i] = sc.next();
				System.out.print("전화번호를 수정해주세요. : ");
				p[i] = sc.next();
				System.out.println();
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			if (hakbun == sn[i]) {
				System.out.println("이름 : " + n[i]);
				System.out.println("학번 : " + sn[i]);
				System.out.println("학과 : " + m[i]);
				System.out.println("전화번호 : " + p[i]);
				System.out.println();
			}
		}
	}
	
	public static String end(Scanner sc) {
		
		System.out.print("프로그램을 종료하시겠습니까? (y / n) : ");
		
		return sc.next(); 
	}

	public static void main(String[] args) {
		
		String result = " ";
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력해주세요. : ");
		String[] name = new String[sc.nextInt()];
		int[] studentNumber = new int[name.length];
		String[] major = new String[studentNumber.length];
		String[] phoneNumber = new String[major.length];
		
		while (true) {
			System.out.println();
			System.out.println("*** 학생관리 프로그램 ***");
			System.out.println("1. 학생등록");
			System.out.println("2. 전체출력");
			System.out.println("3. 학생조회");
			System.out.println("4. 정보수정");
			System.out.println("5. 프로그램 종료.");
			System.out.println();
			System.out.print("번호를 입력해주세요. : ");
			System.out.println();
			switch (sc.nextInt()) {
				case 1:
					setting(name, studentNumber, major, phoneNumber, sc);
					break;
				case 2:
					print(name, studentNumber, major, phoneNumber);
					break;
				case 3:
					search(name, studentNumber, major, phoneNumber, sc);
					break;
				case 4:
					change(name, studentNumber, major, phoneNumber, sc);
					break;
				case 5:
					result = end(sc);
					break;
			}
			if (result.equalsIgnoreCase("y")) {
				System.out.println("수고하셨습니다.");
				break;
			}
		}
	}
}