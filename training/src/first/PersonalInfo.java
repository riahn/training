package first;

import java.util.Scanner;

public class PersonalInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sno, sname, saddress, stelno, semail;
		int iage;
		
		System.out.println("사원번호, 이름, 나이, 주소, 전화번호, 이메일을 입력하세요.");
		Scanner input = new Scanner(System.in);
		
		sno = input.next();
		sname = input.next();
		iage = input.nextInt();
		saddress = input.next();
		stelno = input.next();
		semail = input.next();
		
		System.out.println("\n사원번호: " + sno + "\n이름: " + sname + "\n나이: " + iage);
		System.out.println("주소: " + saddress + "\n전화번호: " + stelno + "\n이메일: " + semail);

	}

}
