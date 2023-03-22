package generic;

class StringType {
	
	String[] str;
	String var;
	
	void setStr(String[] str) {
		this.str = str;
	}
	
	void setVar(String var) {
		this.var = var;
	}
	
	void output() {
		for(String s : str) {
			System.out.println("str 배열 요소 >>> " + s);
		}
		System.out.println("var >>> " + var);
	}
}

class IntegerType {
	
	Integer[] iarr;
	Integer ivar;
	
	void setStr(Integer[] iarr) {
		this.iarr = iarr;
	}
	
	void setVar(Integer ivar) {
		this.ivar = ivar;
	}
	
	void output() {
		for(Integer s : iarr) {
			System.out.println("iarr 배열 요소 >>> " + s);
		}
		System.out.println("ivar >>> " + ivar);
	}
}

public class Generic_02 {

	public static void main(String[] args) {
		
		// StringType 클래스 객체 생성
		StringType st = new StringType();
		String[] str = {"홍길동", "이순신", "유관순"};	
		String var = "김연아";
		
		st.setStr(str);
		st.setVar(var);
		st.output();
		System.out.println();
		
		// IntegerType 클래스 객체 생성
		IntegerType it = new IntegerType();
		Integer[] iarr = {10, 20, 30, 40, 50};
		Integer ivar = 500;
		
		it.setStr(iarr);
		it.setVar(ivar);
		it.output();
		
	}
}