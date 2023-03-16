package classes;

public class PigSave_09 {

	public static void main(String[] args) {
		// 돼지저금통 객체 생성.
		PigSave save = new PigSave(0);
		
		save.deposit(30000); // 입금 메서드 호출
		save.deposit(20000); // 입금 메서드 호출
		save.withdraw(40000); // 출금 메서드 호출
		save.deposit(20000); // 입금 메서드 호출
		save.withdraw(40000); // 출금 메서드 호출
		
		// 이렇게 접근이 되면 안됨.
//		save.balance = 100000;
		
	}
}