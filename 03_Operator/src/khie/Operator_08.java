package khie;

public class Operator_08 {

	public static void main(String[] args) {
		
		// 키보드를 이용하여 두 개의 숫자를 입력을 받자.
		String su1 = args[0];
		String su2 = args[1];
		
		System.out.println("su1 + su2 >>> " + (su1 + su2));
		
		int num1 = Integer.parseInt(su1);
		int num2 = Integer.parseInt(su2);
		
		System.out.println("num1 + num2 >>> " + (num1 + num2));
		
	}
}