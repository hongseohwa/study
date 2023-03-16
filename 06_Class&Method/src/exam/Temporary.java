package exam;

public class Temporary {
	String name;
	int time;
	int pay;
	
	public Temporary() {}
	
	public Temporary(String name, int time, int pay) {
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	void print() {
		System.out.println("----------------------");
		System.out.println("이름 : " + name);
		System.out.printf("총급여 : %,d원%n", (time * pay));
		System.out.printf("공제액 : %,d원%n", (int)((time * pay) * 0.03));
		System.out.printf("실지급액 : %,d원%n", (int)((time * pay) - ((time * pay) * 0.03)));
	}
}