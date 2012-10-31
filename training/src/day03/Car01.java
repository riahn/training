package day03;

public class Car01 {
	
	String cn;
	int speed;
	
	public Car01() {

	}

	public Car01(String cn) {
		this.cn = cn;
	}

	public Car01(String cn, int speed) {
		this(cn);					//위에 정의한 생성자를 this를 이용해 호출
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}
	
	

}
