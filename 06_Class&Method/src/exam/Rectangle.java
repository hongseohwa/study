package exam;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	void area() {
		System.out.println("사각형의 넓이 : " + (width * height));
	}
	
	void size() {
		System.out.println("사각형의 둘레 : " + ((width + height) * 2));
	}
}
