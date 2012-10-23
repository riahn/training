package first;

import java.util.Scanner;

public class Test06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("가로 ? ");
		int garo = in.nextInt();
		
		System.out.print("세로 ? ");
		int sero = in.nextInt();
		
		System.out.println("가로길이: " + garo + "cm" + "세로길이: " + sero + "cm");

	}

}
