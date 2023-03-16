package method;

// 메서드 호출 시 반환형

public class Method_07 {
	
	// 값이 반환이 된 경우
	public static int method1() {
		return 155;
	}
	
	// 변수명이 반환되는 경우
	public static int method2(int x, int y) {
		int sum = (x * 2) + (y * 2);
		return sum;
	}
	
	// 수식이 반환되는 경우
	public static int method3(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		
//		int su = method1();
		
		System.out.println("method1() 메서드 호출 후 반환된 값 >>> " + method1());
		
		System.out.println("method2() 메서드 호출 후 반환된 값 >>> " + method2(200, 145));
		
		System.out.println("method3() 메서드 호출 후 반환된 값 >>> " + method3(200, 145));
		
	}
}