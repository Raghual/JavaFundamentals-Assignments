package myproject;

import java.util.Scanner;

public class ReverseingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n,r,revnum=0;
		n=s.nextInt();
		while(n>0) {
			r=n%10;
			revnum=revnum*10+r;
			n=n/10;
		}
		System.out.println(revnum);
	}

}
