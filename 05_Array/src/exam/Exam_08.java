package exam;

public class Exam_08 {

	public static void main(String[] args) {
		
		
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			for (char ch1 = 'A'; ch1 <= ch; ch1++) {
				System.out.print(ch1);
			}
			System.out.println();
		}
	}
}