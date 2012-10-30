package second;

public class CarDriver {
	
	String name;
	Car ca = new Car();
	
	void initCar(){
		ca.speed = 0;
		ca.wheelNum = 4;
		ca.setCarName("붕붕");
		System.out.println("차명: " + ca.getCarName());
	}
	
	
	void driveCar(){
		ca.speedUp(1);
		System.out.println("speed = " + ca.getSpeed());
	}
	
	
	

}
