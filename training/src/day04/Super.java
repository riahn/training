package day04;

abstract public class Super {

	private int x;

	public Super(int x) {
		super();
		this.x = x;
	}

	public Super() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	abstract void draw();

}
