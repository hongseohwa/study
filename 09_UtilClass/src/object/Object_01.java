package object;

/*
 * Object 클래스
 * 1. java의 모든 클래스의 조상 클래스이다.
 *    ==> java의 가장 최상위 조상클래스가 Object 클래스임.
 * 2. 사용자가 정의한 클래스에 자동으로 상속이 된다.
 *    ==> 단, extends 키워드를 사용하지 않은 클래스에만 상속이 됨.
 *    
 * [Object 클래스의 주요 메서드]
 * - toString() : - 객체 자신의 정보를 문자열로 반환하는 메서드.
 *                - 인스턴스에 대한 정보를 문자열로 제공할 목적으로 사용이 됨.
 * - getClass() : - 객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환하는 메서드. 
 * - hashCode() : - 객체 자신의 해쉬 코드를 반환하는 메서드.
 * - equals() : - 객체 자신과 또 다른 객체가 같은 객체인지 알려주는 메서드.
 * - clone() : - 객체 자신의 복사본을 만드는 메서드.
 */

public class Object_01 { // extends Object 생략

	public static void main(String[] args) {
		
		Object_01 ex = new Object_01();
		
		System.out.println("toString() >>> " + ex.toString());
		System.out.println("getClass() >>> " + ex.getClass());
		System.out.println("hashCode() >>> " + ex.hashCode());
		
	}
}