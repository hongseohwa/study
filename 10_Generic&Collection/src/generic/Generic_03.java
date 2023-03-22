package generic;

class Generic<T> {
	T[] arr;
	T var;
	
	void setArr(T[] arr) {
		this.arr = arr;
	}
	
	void setVar(T var) {
		this.var = var;
	}
	
	void output() {
		
		for(T k : arr) {
			System.out.println("arr 배열 요소 >>> " + k);
		}
		
		System.out.println("var >>> " + var);
	}
}

public class Generic_03 {

	public static void main(String[] args) {
		
		// String 타입의 객체 생성.
		Generic<String> st = new Generic<String>();
		String[] str = {"홍길동", "이순신", "유관순"};	
		String var = "김연아";
		
		st.setArr(str);
		st.setVar(var);
		st.output();
		System.out.println();
		
		// String 타입의 객체 생성.
		Generic<Integer> it = new Generic<Integer>();
		Integer[] iarr = {10, 20, 30, 40, 50};
		Integer ivar = 500;
		
		it.setArr(iarr);
		it.setVar(ivar);
		it.output();
	}
}