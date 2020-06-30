package fundamnetalsJava;

import java.util.Scanner;

public class FlowControlAlphaOrDigitOrNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		if(a>64 && a<=127) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special Character");
		}
		
	}

}
