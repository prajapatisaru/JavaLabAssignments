package labassignment1;
public class Shape {

	public static void main(String[] args) {
		  Circle c = new Circle();
	        c.Area(5.5);
	        Square s = new Square();
	        s.area(8.0);
	}
	public class Circle {
	    public void Area(double r){
	        System.out.println("The area of the circle is: "+(22*r*r)/7);
	       
	    }
	}

	public class Square {
	    public void area(double l){
	        System.out.println("The area of square is: "+(l*l));
	        
	    }
	}

	
	}



