package khie;

// Exception_02에서 발생한 예외를 예외 처리 코드를 이용하여 처리해 주자.

public class Exception_05 {

	public static void main(String[] args) {
		
		String str1 = "korea";
		String str2 = null;
		
		System.out.println("프로그램 시작");
		try {
			System.out.println("str1 문자열의 길이 >>> " + str1.length());
			System.out.println("str2 문자열의 길이 >>> " + str2.length());
		} catch(Exception a) {
			System.out.println("null 값을 갖는 오류 발생");
			System.out.println("예외정보 : " + a);
		}
		System.out.println("프로그램 종료");
	}
}