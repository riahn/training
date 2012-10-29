package second;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'a';
		
		do{
			if(ch == 'z'){
				break;
			}else{
				System.out.print(ch + " ");
				ch++;
			}
		}while(ch <= 'z');
		

	}

}
