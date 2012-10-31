package day03;

public class CarF {
	
	//singleton patten
	
	private CarF() {
	//CarF를 생성하지 못하도
	}
	
	static Car01 c=null;		//이 순간 메모리에 적재
	
	static Car01 getCar(){
		if(c==null){
			c=new Car01();
		}
		return c;
	}
	
}
