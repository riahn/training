package day04;

public class Circle extends Shape{

	int ban;
	
	
	
	public Circle(int ban) {
		super();
		this.ban = ban;
	}

	@Override
	void draw() {
		System.out.println("원을 출력");
	}

	@Override
	void cal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Circle [ban=" + ban + "]";
	}


}
