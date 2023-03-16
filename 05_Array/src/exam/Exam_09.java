package exam;

public class Exam_09 {

	public static void main(String[] args) {
		int hap = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				hap += i * -1;
			} else {
				hap += i;
			}
		}
		System.out.println("hap ==> " + hap);
	}
}