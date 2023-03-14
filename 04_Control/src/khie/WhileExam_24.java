package khie;

public class WhileExam_24 {

	public static void main(String[] args) {
		
		// ABCDEFGHIJKLMN .... XYZ 까지 문자를 출력해 보자.
		char alpha = 'A'; // 반복문에서의 초기식
		
		while (alpha <= 'Z') { // 반복문에서의 조건식
			System.out.print(alpha);
			alpha++; // 반복문에서의 증감식
		}
		
		System.out.println();
		
		// ZYXWV .... CBA 까지 문자를 출력해 보자.
		
		char alpha2 = 'Z';
		
		while (alpha2 >= 'A') {
			System.out.print(alpha2);
			alpha2--;
		}
	}
}