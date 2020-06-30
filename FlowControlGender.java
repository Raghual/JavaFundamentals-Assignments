package fundamnetalsJava;

public class FlowControlGender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Male";
		String s2="Female";
		double interest;
		int a=Integer.parseInt(args[1]);
		if(s2.equals(args[0]) && (a>=1 && a<58)){
			 interest=8.4;
			 System.out.println(interest);
		}
		else if(s2.equals(args[0]) && (a>=59 && a<100)) {
			interest=9.2;
			System.out.println(interest);
		}
		else if(s1.equals(args[0]) && (a>=1 && a<58)) {
			interest=8.4;
			System.out.println(interest);
		}
		else {
			interest=10.5;
			System.out.println(interest);
		}
	}
