package day04;

public class Rectangle extends Shape{

	int width;
	int height;
	
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}



	@Override
	void draw() {
		System.out.println("네모 출력");
	}



	@Override
	void cal() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}



}
