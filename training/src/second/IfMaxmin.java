package second;

import java.util.Scanner;

public class IfMaxmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1, su2;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 정수: ");
		su1 = scn.nextInt();
		System.out.println("두번째 정수: ");
		su2 = scn.nextInt();
		
		if(su1 == su2)
			System.out.println("동일한 숫자입니다.\n");
		else
			if(su1 > su2){
				System.out.println("큰값 = " + su1);
				System.out.println("작은값 = " + su2);
			}else{
				System.out.println("큰값 = " + su2);
				System.out.println("작은값 = " + su1);
			}
		
	}

}
