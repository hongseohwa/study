package khie;

import java.util.Scanner;

public class SwitchCaseExam_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직급 (사장 / 전무 / 부장 / 차장 / 과장 / 대리 / 사원) 중 하나의 직급을 선택하세요. : ");
		
		String position = sc.next();
		
		switch (position) {
			case "사장" :
				System.out.println("사장의 월급은 1,000만원 입니다.");
				break;
			case "전무" :
				System.out.println("전무의 월급은 800만원 입니다.");
				break;
			case "부장" :
				System.out.println("부장의 월급은 650만원 입니다.");
				break;
			case "차장" :
				System.out.println("차장의 월급은 500만원 입니다.");
				break;
			case "과장" :
				System.out.println("과장의 월급은 400만원 입니다.");
				break;
			case "대리" :
				System.out.println("대리의 월급은 300만원 입니다.");
				break;
			case "사원" :
				System.out.println("사원의 월급은 200만원 입니다.");
				break;
		}
		
		System.out.println();
		
		// 다중 if ~ else문을 이용하여 구현한 코드
		if (position.equals("사장")) {
			System.out.println("사장의 월급은 1,000만원 입니다");
		} else if (position.equals("전무")) {
			System.out.println("전무의 월급은 800만원 입니다.");
		} else if (position.equals("부장")) {
			System.out.println("부장의 월급은 650만원 입니다.");
		} else if (position.equals("차장")) {
			System.out.println("차장의 월급은 500만원 입니다.");
		} else if (position.equals("과장")) {
			System.out.println("과장의 월급은 400만원 입니다.");
		} else if (position.equals("대리")) {
			System.out.println("대리의 월급은 300만원 입니다.");
		} else if (position.equals("사원")) {
			System.out.println("사원의 월급은 200만원 입니다.");
		} else {
			System.out.println("없는 직급입니다.");
		}
		
		sc.close();
	}
}