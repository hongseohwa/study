package khie;

// 다중 for문 예

public class ForExam_34 {

	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; dan++) { // 구구단에서의 단
			System.out.println("*** " + dan + "단 ***");
			for (int su = 1; su <= 9; su++) {
				System.out.println(dan + " X " + su + " = " + (dan*su));
			} // 안쪽 for문 end
			System.out.println();
		} // 바깥쪽 for문 end
		
		System.out.println();
		System.out.println();
		
		// 구구단에서 타이틀(단) 출력
		for (int k = 2; k <= 9; k++) {
			System.out.print("***" + k + "단 ***\t");
		}
		System.out.println();
		
		for (int su1 = 1; su1 <= 9; su1++) {
			for (int dan1 = 2; dan1 <= 9; dan1++) {
				System.out.print(dan1 + " X " + su1 + " = " + (dan1 * su1) + "\t");
			}
			System.out.println();
		}
	}
}