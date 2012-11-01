package day04;

public class Main {

	public static void main(String[] args) {
		//부모 형의 참조 변수는 자식형 객체 참조 가능
//		Super fc = new FirstChild(100);
//		Super sc = new SecondChild(10);
//		fc.draw();
//		sc.draw();
		
		Super[] Childs = {new FirstChild(100), new SecondChild(10)};
		
		for (int i = 0; i < Childs.length; i++) {
			Childs[i].draw();
		}
		
//		if (Childs[1] instanceof FirstChild) {
//			((FirstChild)Childs).clear() = ;
//			
//		}
		
		//메소드 내에 final 변수는 2번 이상 정의할 수 없다.
		//final 변수는 생성자를 통해 초기화 할수 있다.
		
	}

}
