package exam;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요 : (1. 원형, 2. 사각형)");
		System.out.print("도형 선택 >>> ");
		int menu = sc.nextInt();
		if(menu == 1) {
			System.out.print("원의 반지름 입력 : ");
			Shape circle = new Circle(sc.nextInt());
			System.out.printf("원의 면적 >>> %.1f\n", circle.findArea());
		} else if(menu == 2){
			System.out.print("사각형의 가로 세로 입력 : ");
			Shape rectangle = new Rectangle(sc.nextInt(), sc.nextInt());
			System.out.printf("사각형의 면적 >>> %.1f\n", rectangle.findArea());
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();
	}
}