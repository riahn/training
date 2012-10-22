package academy;

import java.util.Scanner;

public class ScannerInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		String name;
		double weight, height;
		Scanner scan = new Scanner(System.in);
		System.out.print("나이: ");
		age = scan.nextInt();
		System.out.print("이름: ");
		name = scan.next();
		System.out.println();
		System.out.println("이름: " + name + "나이: " + age);		
		System.out.print("몸무게: ");
		weight = scan.nextDouble();
		System.out.print("키: ");
		height = scan.nextDouble();
		System.out.print("몸무게: " + weight);
		System.out.println("키: " + height);

	}

}
