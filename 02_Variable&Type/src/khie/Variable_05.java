package khie;

/*
 * 실수자료형 : 소숫점이 존재하는 자료형.
 * - float : 소숫점 이하 6 ~ 7자리까지 표현이 가능함.
 * - double(기본형) : 소숫점 이하 15 ~ 16자리까지 표현이 가능함.
 */

public class Variable_05 {

	public static void main(String[] args) {
		
		double dNum = 123.45666;
		System.out.println("dNum >>> " + dNum);
		
		float fNum = 1245.78954f;
		System.out.println(fNum);
		
		/*
		 * float 자료형의 변수에 실수 값을 저장 시 오류 발생.
		 * 이유 : 실수 자료형의 기본형은 double형이기 때문임.
		 * - 따라서 float 자료형의 변수에 실수 데이터를 저장 시 반드시 실수 값 뒤에 f를 붙여 주어야 함(생략 시 error 발생)
		 * - 실수 자료형에서 명시적 형변환 작업을 진행하더라도 자료의 손실은 거의 발생하지 않음.
		 */
		
	}
}