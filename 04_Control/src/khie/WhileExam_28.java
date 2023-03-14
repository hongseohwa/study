package khie;

import java.util.Scanner;

/*
 * up / down 게임 
 */

public class WhileExam_28 {

	public static void main(String[] args) {
		
		int input = 0; // 키보드로 내가 입력한 숫자
		int count = 0; // 몇 번 만에 맞추는지 카운트 변수
				
		Scanner sc = new Scanner(System.in);
		System.out.println("*** UP / DOWN 게임 ***");
		int su = (int)(Math.random() * 99) + 1;
		System.out.println("1 ~ 99 사이의 숫자 중에서 하나의 숫자를 맞추세요.");
		
		while (input != su) {
			System.out.print("숫자 입력 >>> ");
			input = sc.nextInt();
			if (input > su) {
				System.out.println("더 작은 숫자입니다.....");
			} else if (input < su) {
				System.out.println("더 큰 숫자입니다.....");
			}
			System.out.println("-------------------------------");
			count++;
		}
		System.out.println("축하합니다.. 정답입니다.");
		System.out.println("정답 숫자 >>> " + su);
		System.out.println("정답 소요 횟수 >>> " + count);
		sc.close();
	}
}