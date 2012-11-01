package day04;

public class FirstChild extends Super{

	public FirstChild(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	void draw() {
		System.out.println("x=" + getX() + " First 그림");
	}

	void clear() {
		System.out.println("x=" + getX() + " First 그림 삭제");
	}
}
