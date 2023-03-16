package method;

import java.util.Scanner;

/*
 * 메서드(Method)?
 * 1. C 언어에서의 함수(function)과 같음.
 * 2. 기능을 정의하는 단위(예 : 덧셈 기능, 뺄셈 기능 등등)
 * 3. 하나의 기능만을 정의하는 것이 좋음.
 * 4. 자주 반복되는 내용을 정의해 놓고, 필요할 때 호출하여 사용함.
 * 
 * 형식)
 *   [접근제한] 반환형 메서드 이름(매개변수 혹은 인자) {
 *       메서드 호출 시 실행될 문장;
 *   }
 *   
 * - 접근제한 : public > protected > default > private
 *            (클래스, 메서드, 변수 앞에 사용됨)
 * - 반환형 : - 메서드를 시행하고 특정 타입의 결과를 반환해 주겠다고 선언하는 것을 반환형(리턴타입)이라고 말함.
 *     	    - 메서드에서 실행된 결과값을 돌려주는 자료형으로 생략이 불가능함.
 *          - 해당 메서드가 어떤 동작이나 기능을 실행한 후 결과를 알려주는 자료형.
 *          - 만약 결과를 되돌려줄 필요가 없는 경우에는 void 라는 키워드를 작성함.
 *          - 반환형이 void인 경우를 제외하고 결과를 되돌려 주어야 할 때는 메서드 명령문 맨 마지막에 return이라는 키워드를 작성 후, 앞에서 선언한 반환형과 같은 자료형으로 결과를 되돌려준다.
 * - 메서드 이름 : - 식별자, 소문자로 시작, 두 개의 단어가 결합이 된 경우에는 CamelCase 기법으로 작성을 함.
 * - 매개변수 : - 외부에서 값을 넘겨 받는 변수, 생략 가능.
 *            - 메서드 호출 시 전달되는 값의 저장을 위한 용도로 사용이 됨.
 *            - 메서드 호출 시 전달되는 값의 자료형과 매개변수의 자료형은 반드시 일치해야 함.
 * - 메서드 실행문 : - 해당 메서드가 호출된 경우에만 실행이 됨.         
 */

public class Method_01 {
	
	public static void output() {
		System.out.println("output() 메서드 호출");
	} // output() 메서드 end
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr [" + i + "] >>> " + arr[i]);
		}
		
		sc.close();
		
	} // input() 메서드 end
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		// 메서드 호출
		output();
		input();
		
		System.out.println("프로그램 종료");
		
	}
}