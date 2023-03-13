package khie;

/*
 * 3. 논리연산자
 * 	  - 논리곱(&&) : 주어진 조건이 모두 참인 경우에만 결과가 true가 됨. 그 나머지는 모두 false가 됨.
 * 	  - 논리합(||) : 주어진 조건 중에 하나라도 참이면 결과는 true가 됨. 그 나머지는 모두 false가 됨.
 * 	  - 부정(!) : true -> false, false -> true가 됨.
 */

public class Operator_03 {

	public static void main(String[] args) {
		
		int su1 = 10, su2 = 7;
		
		// 논리곱인 경우 : true && true ==> true
		boolean test = (su1 >= su2) && (su1 >= 5);
		System.out.println("test 결과 >>> " + test);
		System.out.println();
		
		// 논리곱인 경우 : true && false
		test = (su1 >= su2) && (su1 <= 5);
		System.out.println("test 결과 >>> " + test);
		System.out.println();
		
		// 논리합인 경우 : true || true ==> true
		test = (su1 >= su2) || (su1 >= 5);
		System.out.println("test 결과 >>> " + test);
		System.out.println();
		
		// 논리합인 경우 : true || false ==> true
		test = (su1 >= su2) || (su1 <= 5);
		System.out.println("test 결과 >>> " + test);
		System.out.println();
		
	}
}