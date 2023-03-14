package khie;

import java.util.Scanner;

public class SwitchCaseExam_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 a ~ c 중에서 한 글자 선택 : ");
//		String menu = sc.next();
		char fruit = sc.next().charAt(0);
		
		switch (fruit) {
			case 'a' :
				System.out.println("선택한 과일은 apple 입니다.");
				break;
			case 'b' :
				System.out.println("선택한 과일은 banana 입니다.");
				break;
			case 'c' :
				System.out.println("선택한 과일은 cherry 입니다.");
				break;
			default :
				System.out.println("선택한 과일이 없습니다.");
		}
		
		sc.close();
	}
}