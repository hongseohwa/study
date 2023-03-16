package exam;

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		int sum, change, price = 0;
		String coffeeStr = " ";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("** coffee 메뉴 ***");
		System.out.println("1. 아메리카노 - 3,000원");
		System.out.println("2. 카페라떼 - 4,000원");
		System.out.println("3. 마키아또 - 4,500원");
		System.out.println("4. 바닐라라떼 - 4,500원");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		int menu = sc.nextInt();
		System.out.print("주문수량 >> ");
		int t = sc.nextInt();
		System.out.print("입금액 >> ");
		int money = sc.nextInt();
		
		System.out.println();
		
		switch (menu) {
			case 1:
				coffeeStr = "아메리카노";
				price = 3000;
				break;
			case 2:
				coffeeStr = "카페라떼";
				price = 4000;
				break;
			case 3:
				coffeeStr = "마키아또";
				price = 4500;
				break;
			case 4:
				coffeeStr = "바닐라라떼";
				price = 4500;
				break;
			default :
				System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
		}
		
//		if (menu == 1) {
//			sum = (3000 * t) + ((3000 * t) / 10);
//			change = money - sum;
//			System.out.println("주문한 메뉴 : 아메리카노");
//			System.out.println("커피단가 : 3000원");
//		} else if (menu == 2) {
//			sum = (4000 * t) + ((4000 * t) / 10);
//			change = money - sum;
//			System.out.println("주문한 메뉴 : 카페라떼");
//			System.out.println("커피단가 : 4000원");
//		} else if (menu == 3) {
//			sum = (4500 * t) + ((4500 * t) / 10);
//			change = money - sum;
//			System.out.println("주문한 메뉴 : 마키아또");
//			System.out.println("커피단가 : 4500원");
//		} else {
//			sum = (4500 * t) + ((4500 * t) / 10);
//			change = money - sum;
//			System.out.println("주문한 메뉴 : 바닐라라떼");
//			System.out.println("커피단가 : 4500원");
//		}
		sum = (price * t) + (int)((price * t) * 0.1);
		change = money - sum;
		
		System.out.println("주문한 메뉴 : " + coffeeStr);
		System.out.println("커피단가 : " + price + "원");
		System.out.println("주문수량 : " + t);
		System.out.println("입금액 : " + money + "원");
		System.out.println("총금액 : " + sum + "원");
		System.out.println("거스름 돈 : " + change + "원");
		
		sc.close();
	}
}