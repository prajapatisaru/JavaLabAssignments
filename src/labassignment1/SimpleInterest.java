package labassignment1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,t,r;
		float si;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the principle:");
		p=sc.nextInt();
		System.out.print("enter the time:");
		t=sc.nextInt();
		System.out.print("enter the rate:");
		r=sc.nextInt();
		si=Interest(p,t,r);
		System.out.println("Simple Interest is:"+si);		
	}
	static float Interest(int p, int t, int r)
	{
		return (p*t*r)/100;
	}
	
}


