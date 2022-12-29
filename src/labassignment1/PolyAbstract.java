package labassignment1;
abstract class AbstractClass {
    public void method1(){
        System.out.println("test");
    }
    public  abstract void method2();
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
public class PolyAbstract extends AbstractClass{
	 @Override
	    public void method2(){
	        System.out.println("This is the method 2 declaration from the another class");
	        }
	public static void main(String[] args) {
		PolyAbstract c = new PolyAbstract();
        c.method1();
        c.method2();
	}

}
