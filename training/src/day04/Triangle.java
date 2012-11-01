package day04;

public class Triangle extends Shape{
	
	int logWidth;
	int height;
	
	

	public Triangle(int logWidth, int height) {
		super();
		this.logWidth = logWidth;
		this.height = height;
	}



	@Override
	void draw() {
		System.out.println("삼각형 출력");
	}



	@Override
	void cal() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "Triangle [logWidth=" + logWidth + ", height=" + height + "]";
	}

	

}
