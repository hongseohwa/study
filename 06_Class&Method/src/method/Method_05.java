package method;

/*
 * ★★★★★★★★★★★★★★★★★
 * 메서드 호출 방식 - 2가지
 * 1. call by value 방식
 *    - 값을 전달하여 호출하는 방식.
 *    - 매개변수가 기본자료형(int, double 등등) 사용.
 *    
 * 2. call by reference 방식
 *    - java에서 많이 사용하는 방식(무지무지 중요함)
 *    - 주소값을 전달하여 호출하는 방식.
 *    - 매개변수가 참조자료형(배열, 클래스) 사용
 */

public class Method_05 {
	
	public static void call(int num) {
		num = 100;
		
		System.out.println("num >>> " + num);
	}

	public static void main(String[] args) {
		
		// 1. call by value 방식
		int num = 200;
		
		System.out.println("메서드 호출 전 ...... ");
		
		System.out.println("num >>> " + num);
		
		call(num);
		
		System.out.println("메서드 호출 후 ......");
		
		System.out.println("num >>> " + num);
	}
}