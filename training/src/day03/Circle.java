package day03;

public class Circle extends Shape{
	
	public Circle(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	void draw() {
		super.draw();
		System.out.println("원을 그린다.");
	}
}
