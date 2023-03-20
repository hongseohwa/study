package exam;

public class Temporary extends Employee {
	
	private int time, pay;
	
	public Temporary() { }
	
	public Temporary(String name, int time, int pay) {
		super(name);
		this.time = time;
		this.pay = pay;
	}

	public int getTime() {
		return time;
	}

	public int getPay() {
		return pay;
	}

	@Override
	public int getPays() {
		return pay * time;
	}
}