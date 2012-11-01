package day04;

public class ShapeManager {
	//Shape 배열 element의 크기는 10으로 고정되어
	 //있다고 가정한다.
	
	String str;
	int arrNum = 0;

	public ShapeManager(String str) {
		super();
		this.str = str;
	}

	Shape[] element = new Shape[10];
	
	void createShape(Shape sh){
		sh.draw();
		element[arrNum] = sh;
		arrNum++;
		System.out.println("객체 " + arrNum + " 생성");
	}
	
	void drawAllElement(){
		for (int i = 0; i < arrNum; i++) {
			
		}
	}
	
	void printAllElement(){
		for (int i = 0; i < arrNum; i++) {
			System.out.println(element[i].toString());
		}
	}

}
