package day03;

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car01 ca1 = new Car01();
		//System.out.println(ca1.getCn());
		
		//Car01 ca2 = new Car01();
		//System.out.println(ca2.getCn());
		
		Car01 car = CarF.getCar();			//이 순간 CarF를 메모리에 적재
		System.out.println(car.getCn());

	}

}
