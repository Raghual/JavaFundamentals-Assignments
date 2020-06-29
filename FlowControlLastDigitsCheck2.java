package fundamnetalsJava;

import java.util.Scanner;

public class FlowControlLastDigitsCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a%10==b%10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
