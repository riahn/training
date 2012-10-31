package day03;

public class Child extends Parent{
	
//	String a="My Parent name is Hong gildong";
	String b="My name is Hong samwon";
	
	void ma() {
		System.out.println(a + " heh?");
	}

	void mab(){
//		System.out.println(a);
		ma();
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		new Child().mab();
	}
}
