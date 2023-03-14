package khie;

// 주사위를 굴려서 임의의 숫자를 하나 받아 보자.

public class IfElseIfExam_15 {

	public static void main(String[] args) {
		
		// Math.random() : 0.0 <= su < 1
		// 1 ~ 100
		// 0.000001... ~~~ 0.999999... ==> * 100 ==> 0 ~ 99
		// (int)(0.0000 ~ 99.9999)
		int random = (int)(Math.random() * 6) + 1;
		
		if (random == 1) {
			System.out.println("주사위의 1번이 나왔습니다.");
		} else if (random == 2) {
			System.out.println("주사위의 2번이 나왔습니다.");
		} else if (random == 3) {
			System.out.println("주사위의 3번이 나왔습니다.");
		} else if (random == 4) {
			System.out.println("주사위의 4번이 나왔습니다.");
		} else if (random == 5) {
			System.out.println("주사위의 5번이 나왔습니다.");
		} else {
			System.out.println("주사위의 6번이 나왔습니다.");
		} 
	}
}