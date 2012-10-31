package day03;

public class Shape {
	
	Point p;

	public Shape(){
		
	}
	
	public Shape(Point p) {
		this.p = p;
	}

	void draw(){
		System.out.print(p.toString());
	}

}
