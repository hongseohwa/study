package khie;

/*
 * 2. throws 키워드
 *    - 예외 처리를 위임시키는 명령어.
 *    형식) 메서드명 throws 예외처리클래스 { }
 *    - throws 로 지정된 메서드를 호출할 경우 메서드 내에서 예외가 발생하면 
 *    해당 예외를 메서드를 호출한 곳으로 위임시켜서 예외를 처리하는 방법.
 */

public class Exception_09 {

	void exception1() throws Exception {
		String str1 = "java";
		
		String str2 = null;
		
		try {
			System.out.println("str1 문자열 길이 >>> " + str1.length());
			System.out.println("str2 문자열 길이 >>> " + str2.length());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	void exception2() throws Exception{
		int num1 = 15, num2 = 0, result = 0;
		
		try {
			result = num1 / num2;
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("result >>> " + result);
	}
		
	public static void main(String[] args) {
			
		Exception_09 exception = new Exception_09();
		try {
			exception.exception1();
				
			exception.exception2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}