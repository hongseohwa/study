package khie;

/*
 * 변수(Variable)?
 * - 프로그래밍에서 가장 기본적인 동작은 데이터를 저장하고, 저장된 데이터 값을 읽어 오는 것.
 * - 데이터를 저장하려면 메모리에 값을 저장할 공간을 생성하고 이름을 부여해야 함.
 * - 변수는 하나의 데이터(값)를 저장할 수 있는 메모리 공간을 의미함.
 * - 변수는 여러 개의 값을 저장할 수 없고, 오직 하나의 값만을 저장할 수 있음.
 * - 필요한 데이터를 저장할 곳을 미리 선언을 해 두고, 나중에 계속해서 사용하기 위해 변수를 만듦.
 * - 데이터를 저장하기 위해 생성되는 메모리 공간은 목적에 따라 크기와 특징이 다른데, 이를 자료형이라고 함.
 *   즉, 메모리 공간의 자료형에 따라 저장할 수 있는 값의 종류와 크기가 결정이 됨.
 *
 * 변수 선언하는 방법
 * - 형식) 자료형 변수명;
 *
 * - 자료형 : java의 기본 자료형(8가지)
 * - 변수명 : 사용자가 임의로 만들 수 있음.
 */

/*
 * java에서의 기본 자료형(8가지)
 * 
 * 1. 정수형(정수자료형) : byte(1바이트), short(2바이트), int(4바이트 - 기본자료형), long(8바이트)
 * 2. 실수형 : float(4바이트), double(8바이트 - 기본자료형)
 * 3. 단일문자형 : char(2바이트 ~ 3바이트)
 * 4. 논리형(논리자료형) : boolean(true/false)
 * 
 * - 나머지 자료형은 참조 자료형 : 5장부터 나오는 내용
 */

/*
 * 변수 사용 절차
 * 1. 변수 선언 - 자료형 변수명;
 * 2. 변수 초기화 - 변수에 값을 저장(= 기호를 사용)
 * 3. 변수 이용 - 연산 및 출력
 * 
 * 변수명(식별자) 만드는 작성 규칙
 * - 변수명, 메서드명, 클래스명 등의 이름을 지정할 때 사용함.
 * 
 * 1. 예약어(키워드 - 문법적으로 사용되는 단어) 사용 불가.
 * 2. 영문자 또는 특수문자(_ or $)로 시작해야 함.
 * 3. 숫자로 시작하면 안 됨. - 예) 1sum(X)
 * 4. 대소문자 구분함. - SUM과 sum은 다른 변수명으로 인식함.
 * 5. 변수명은 의미 있게 만드는 것이 좋음.
 * 6. 변수명에 두개의 단어가 연결이 되는 경우에는 두번째 글자의 첫글자는 대문자로 작성하는 것이 관례임(CarmelCase 기법)
 */

public class Variable_01 {

	public static void main(String[] args) {
		
		// 1. 변수 선언
		byte su;
		byte su2;
		
		// 2. 변수 초기화 - 변수에 값을 저장(= 기호를 사용)
		su = 73;
		
		su2 = 22;
		
		
		// 3. 변수 이용 - 연산 및 출력
		System.out.println(su + su2);
		
	}
}