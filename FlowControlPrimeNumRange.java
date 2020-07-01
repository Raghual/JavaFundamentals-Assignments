package myproject;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,flag=0,b;
		a=s.nextInt();
		b=s.nextInt();
		for(int i=a;i<=b;i++) {
		if(i==2) 
			System.out.println(i);
		if(i>2) {
		for(int j=2;j<=Math.ceil(Math.sqrt(a));j++) {
			if(i%j==0) {
				flag=0;
				break;}
			else
				flag=1;
		}
		if(flag==1)
			System.out.println(i);
	}

	}
	}

}
