package day04;

public class MyDraw{ 
	public static void main(String [] agrs){ 
		ShapeManager s = new ShapeManager("그림판");
		
		s.createShape(new Circle(5));		//반지름 5

		s.createShape(new Rectangle(4,5));	//너비 4, 높이 5

		s.createShape(new Triangle(4,10));	//밑변 4, 높이 10
	
		//모든 도형의 면적을 구한다.
		//반지름이 5인 원의 면적은 5*5*PI입니다.
		//너비 4, 높이 5인 사각형의 면적은 4*5입니다.
		//밑변 4, 높이 10인 삼각형의 면적은4*10*1/2입     니다.
	
		s.drawAllElement();
		//모든 도형의 정보를 출력한다.(toString을 이용)
		//반지름이 5인 원입니다.
		//너비 4, 높이 5인 사각형입니다.
		//밑변 4, 높이 10인 삼각형입니다.
		s.printAllElement();
	}
}
