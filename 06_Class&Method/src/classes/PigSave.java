package classes;

// 돼지 저금통

public class PigSave {
	
	private int balance; // 돼지 저금통 잔액
	
	public PigSave() {} // 기본 생성자
	
	public PigSave(int b) { // 인자 생성자
		balance = b;
	}
	
	// 입금을 하는 메서드
	public void deposit(int money) {
		System.out.println("돼지저금통에 입금을 합니다.");
		
		balance += money;
		
		System.out.println("현재 잔액 >>> " + balance + "원");
	}
	
	// 출금을 하는 메서드
	public void withdraw(int money) {
		
		if (money > balance) {
			System.out.println("잔액이 부족합니다.");
			return; // 현재 실행되고 있는 메서드를 종료시키는 명령어
		}
		
		System.out.println("돼지저금통에 출금을 합니다.");
		
		balance -= money;
		
		System.out.println("현재 잔액 >>> " + balance + "원");
	}
}