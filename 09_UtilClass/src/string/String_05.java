package string;

import java.util.StringTokenizer;

/*
 * StringTokenizer 클래스
 * - 특수 문자를 기준문자(delimiter)를 기준으로 문자열을 잘라 주는(parsing, 파싱) 클래스
 * - 기준 문자로 분리된 문자열을 토큰(token)이라고 함.
 * - 웹에서 전화번호를 하이픈(-) 기준으로 앞자리, 중간자리, 뒷자리 형식으로 구분해서 번호를 추출할 때 사용함.
 *   (예 : 주민번호, 핸드폰 번호 등등)
 */

public class String_05 {

	public static void main(String[] args) {
		
		String str = "id = hong & pwd = 1234 & name = 홍길동 & age = 27 & addr = 서울시 & phone = 010-1111-1234";
		StringTokenizer st = new StringTokenizer(str, "&");
		
		// countTokens() : 기준문자로 분리된 토큰의 갯수를 정수 값으로 반환해 주는 메서드.
		System.out.println("토큰 수 >>> " + st.countTokens());
		
		// hasMoreTokens() ==> 반환할 다음 토큰이 있는지를 확인하는 메서드.
		// 있으면 true 값을 반환, 없으면 false 값 반환.
		while(st.hasMoreTokens()) {
			
			// nextToken() : 존재하는 토큰을 반환해 주는 메서드.
			System.out.println(st.nextToken());
		}
	}
}