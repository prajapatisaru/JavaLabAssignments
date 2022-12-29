package labassignment1;
import java.util.Scanner;
public class AreaNperimeter {
	public int length, breadth, area, perimeter;
	public AreaNperimeter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle:");
		length = sc.nextInt();
		breadth = sc.nextInt();
		sc.close();
	}
	public void display() {
		System.out.println("The perimeter of rectangle is: "+ 2*(length + breadth));
		System.out.println("The area of rectangle is: " + length * breadth);
	}
		
	public static void main(String[] args) {
		AreaNperimeter r = new AreaNperimeter();
		r.display();
	}
}

