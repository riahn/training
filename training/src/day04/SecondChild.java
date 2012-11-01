package day04;

public class SecondChild extends Super{

	public SecondChild(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	void draw() {
		System.out.println("x=" + getX() + " Second 그림");
	}
	void clear() {
		System.out.println("x=" + getX() + " Second 그림 삭제");
	}

}
