package object;

public class Object_03 {

	public static void main(String[] args) {
		
		// String 배열 객체 생성
		String[] str = new String[4];
		str[0] = "홍길동";
		str[1] = "hong";
		str[2] = "서울시 중구 남대문로";
//		str[3] = 200; // 자료형의 불일치로 error
		str[3] = "010-1111-1234";
		
		for(String s : str) {
			System.out.println("str 배열 요소 >>> " + s);
		}
		System.out.println();
		
		// Object 배열 객체 생성
		Object[] obj = new Object[4];
		obj[0] = "이순신"; // 문자열(String) 자료형
		obj[1] = 155; // 정수(int) 자료형
		obj[2] = true; // boolean 자료형
		obj[3] = 3.56; // 실수(double) 자료형
		
		for(Object o : obj) {
			System.out.println("obj 배열 요소 >>> " + o);
		}
	}
}