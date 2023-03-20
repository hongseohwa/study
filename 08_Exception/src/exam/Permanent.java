package exam;

public class Permanent extends Employee{
	
	private int salary, bonus;
	
	public Permanent() { }
	
	public Permanent(String name, int salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return salary;
	}

	public int getBonus() {
		return bonus;
	}

	@Override
	public int getPays() {
		return salary + bonus;
	}
}