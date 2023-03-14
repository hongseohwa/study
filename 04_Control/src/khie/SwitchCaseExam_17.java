package khie;

import java.util.Scanner;

public class SwitchCaseExam_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요. : ");
		int su = sc.nextInt();
		
		switch (su % 5) {
			case 0 :
				System.out.println("5의 배수입니다.");
				break;
			case 1 :
				System.out.println("나머지가 1입니다.");
				break;
			case 2 :
				System.out.println("나머지가 2입니다.");
				break;
			case 3 :
				System.out.println("나머지가 3입니다.");
				break;
			case 4 :
				System.out.println("나머지가 4입니다.");
				break;
		}
		
		sc.close();
	}
}