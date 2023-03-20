package exam;

public class Rectangle implements Shape {
	
	int w, h;
	
	public Rectangle() { }

	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	@Override
	public double findArea() {
		return w * h;
	}
}