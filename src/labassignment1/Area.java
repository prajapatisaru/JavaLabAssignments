package labassignment1;
import java.util.Scanner;
import java.util.*;
public class Area {
	   static double circle(double r)
	    {
		return (22*r*r)/7;
	    }
	   
	   static double rectangle(double l,double b){
	       return l*b;
	   }
	   static int square(int l)
	    {
		return l*l;
	    }
	   
	   static double Sphere(double r){
	       return (4*22*r*r)/7;
	   }
	    public static void main(String[] args) {
	       Scanner s= new Scanner(System.in);
	      System.out.print("Enter the radius:");
	      double rad= s.nextDouble();      
	      double  a=circle(rad);
	      System.out.println("Area of Circle is: " + a);    
	   
	        System.out.print(" Enter the length of the rectangle:");
	        double l = s.nextDouble();
	        System.out.print(" Enter the breadth of the rectangle:");
	        double b = s.nextDouble();
	        double Area=rectangle(l,b);
	        System.out.println("Area of Rectangle is: "+Area);
	        
	         System.out.print("Enter the Length of the square:");
	         int L = s.nextInt();
	         int Areaa=square(L);
	         System.out.println("Area of the Square is: "+Areaa);
	         
	         System.out.print("Enter the radius of Sphere:");
	      double radius= s.nextDouble();      
	      double  AreaOfSphere=Sphere(radius);
	      System.out.println("Area of Sphere is: " +AreaOfSphere );    
	         
	    }
	

}
