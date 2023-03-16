package classes;

public class Number_10 {

	public static void main(String[] args) {
		
		Number number = new Number();
		
		// private 접근지정자가 붙은 멤버에 직접 접근 불가능
//		number.num1 = 200;
//		number.num2 = 100;
		
		number.setNum1(200);
		number.setNum2(100);
		
		System.out.println("num1 >>> " + number.getNum1());
		System.out.println("num2 >>> " + number.getNum2());
	}
}