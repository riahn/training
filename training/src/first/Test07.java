package first;

import java.util.Scanner;

public class Test07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String no, name;
		int age;
		System.out.println("학번 이름 나이 순으로 입력하세요.");
		no = in.next();
		name = in.next();
		age = in.nextInt();
		System.out.println("----- 실행 결과 -----");
		System.out.println("학번: " + no + "\n이름: " + name + "\n나이: " + age);

	}

}
