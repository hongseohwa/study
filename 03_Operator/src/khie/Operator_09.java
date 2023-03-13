package khie;

import javax.swing.JOptionPane;

public class Operator_09 {

	public static void main(String[] args) {
		
		// 키보드로 두 수를 입력을 받자.
		int su1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 정수 입력"));
		int su2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 정수 입력"));
		
		// 입력받은 두 수를 가지고 산술연산을 진행해 보자.
		System.out.println("덧셈 >>> " + (su1 + su2));
		System.out.println("뺄셈 >>> " + (su1 - su2));
		System.out.println("곱셈 >>> " + (su1 * su2));
		System.out.println("나눗셈 >>> " + (su1 / su2));
		System.out.println("나머지 >>> " + (su1 % su2));
		
	}
}