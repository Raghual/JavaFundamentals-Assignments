package fundamnetalsJava;

import java.util.Scanner;

public class FlowControlOddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==1) {
			System.out.println("ODD");
		}
		else {
			System.out.println("Even");
		}
	}

}
