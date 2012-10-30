package second;

public class Car {
	
	String KM = "k/m";
	String carName;
	int wheelNum;
	int speed;
	
	void speedUp(int v){
		speed += v;
	}
	void speedDown(int v){
		speed -= v;
	}
	void stop(){
		speed = 0;
	}
	public String getKM() {
		return KM;
	}
	public void setKM(String kM) {
		KM = kM;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getWheelNum() {
		return wheelNum;
	}
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
