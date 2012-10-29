package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader rd = new BufferedReader(in);
		//BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("집주소 입력");
		String address = rd.readLine(); //문자열 입력
		System.out.println("나의 집주소는 " + address + "입니다.");
		System.out.print("성별(M 또는 F)?");
		int sex = System.in.read();
		System.out.println("\n 성별: " + "(아스키코드)" + sex + "\n" + "(문자)" + (char)sex);
		
	}

}
