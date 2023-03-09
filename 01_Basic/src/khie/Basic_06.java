package khie;

// java에서 출력 양식

public class Basic_06 {

	public static void main(String[] args) {
		
//		System.out.println();
//		System.out.print();
//		System.out.printf(); ==> format
		System.out.printf("%d + %d = %d\n", 10, 20, (10+20));
		System.out.println("10 + " + "20 = " + (10 + 20));
		
		System.out.printf("%o\n", 10);
		System.out.printf("%x\n", 15);
		System.out.printf("%f\n", 3.2582);
		System.out.printf("%.2f\n", 3.2582);

		/*
		 * 형식("%.소숫점자릿수f")
		 * ==> 정수는 그대로 출력이 되고, 소숫점 아래는 소숫점자리수 까지만 출력이 됨.
		 */
		
		System.out.printf("%.2f\n", 1234123.2582);
		
		System.out.printf("%d\n", 100000000);
		System.out.printf("%,d\n", 100000000);
		
	}
}