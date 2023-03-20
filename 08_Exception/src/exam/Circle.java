package exam;

public class Circle implements Shape {
	
	int r;
	
	public Circle() { }
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	public double findArea() {
		return 3.14 * r * r;
	}
}