package exam;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		int money, price, t, vat, sum, change;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입금액 입력 : ");
		money = sc.nextInt();
		System.out.print("상품 단가 입력 : ");
		price = sc.nextInt();
		System.out.print("상품 수량 입력 : ");
		t = sc.nextInt();
		
		vat = (int)((price * t) * 0.1);
		sum = (price * t) + vat;
		change = money - sum;
		
		System.out.println();
		System.out.println("지불한 금액 : " + money + "원");
		System.out.println("제품단가 : " + price + "원");
		System.out.println("수량 : " + t);
		System.out.println("부가세 : " + vat + "원");
		System.out.println("상품총액 : " + sum + "원");
		System.out.println("거스름 돈 : " + change + "원");
		
		sc.close();
	}
}