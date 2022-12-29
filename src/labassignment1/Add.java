package labassignment1;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number:");
		a=sc.nextInt();
		System.out.print("enter second number:");
		b=sc.nextInt();
		c=addition(a,b);
		System.out.print("Addition of two number is:"+c);	
	}
	static int addition(int x, int y)
	{
		return x+y;
	}

}
