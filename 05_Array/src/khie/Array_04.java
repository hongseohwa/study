package khie;

// 2. 배열의 초기값을 이용하여 배열 생성.

public class Array_04 {

	public static void main(String[] args) {
		
		// 배열을 생성함과 동시에 초기값 설정하는 방법
		int[] arr1 = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < 5; i++) {
			System.out.println("arr1 [" + i + "] >>> " + arr1[i]);
		}
		
	}
}