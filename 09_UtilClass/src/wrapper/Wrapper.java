package wrapper;

import javax.swing.JOptionPane;

/*
 * wrapper class
 * - wrap : 감싸다, 포장하다.
 * - 기본자료형을 클래스 타입으로 포장해 놓은 클래스.
 * - 기본자료형보다 객체로 저장하기 때문에 좀더 다양한 기능을 제공하기 위해서 사용함.
 * - 기본 타입의 값을 내부에 두고 포장 하기 때문에 포장(wrapper) 클래스라고 하기도 함.
 * - 기본자료형 : byte, short, long, float, double, boolean, char, int
 * - wrapper class : Byte, Short, Long, Float, Double, Boolean, Character, Integer
 *                   
 * - wrapper class 사용 이유
 *   1. 매개변수로 객체가 요구될 때
 *   2. 기본형 값이 아니라 객체로 저장해야 할 때
 *   3. 객체간 비교가 필요할 때
 *   
 * ★★★★★★★★★★
 * - wrapper class 를 사용하는 더 중요한 이유 : 형변환이 자유롭다는 특징이 있음.
 */

public class Wrapper {

	public static void main(String[] args) {
		
		// 기본 자료형은 단순한 연산을 하기 위한 용도로 사용이 됨.
		int su1 = 150, su2 = 37;
		System.out.println("더하기 >>> " + (su1 + su2));
		System.out.println();
		
		// 클래스 자료형
		// 박싱(boxing) : 기본자료형 -> 클래스형(wrapper class)
		// 언박싱(unboxing) : 클래스형 -> 기본자료형(
		
		Integer in1 = new Integer(su1);
		Integer in2 = new Integer(su2);
		
		System.out.println("in1 >>> " + in1);
		System.out.println("in2 >>> " + in2);
		
//		int sum = in1 + su2;
		
		// 형변환이 자유로워짐.
		System.out.println(in1.doubleValue());
		
		// 숫자 -> 문자열
		// toString() : 숫자 -> 문자열
		// String.valueOf(숫자) : 숫자 -> 문자열
		System.out.println("문자열 >>> " + (in1.toString() + 34));
		System.out.println("문자열 >>> " + (String.valueOf(su2) + 34));
		
		// 문자열 -> 숫자
		System.out.println("문자열 -> 숫자 >>> " + (Integer.parseInt(in2.toString()) + 44));
		
	}
}