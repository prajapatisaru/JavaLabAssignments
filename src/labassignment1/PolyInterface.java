package labassignment1;
interface InterfaceN {
    public void method1();
    void method2();
}
public class PolyInterface implements InterfaceN{
	 @Override
	    public void method1(){
	        System.out.println("From method 1");
	    }
	    @Override 
	    public void method2(){
	        System.out.println("From method 2");
	    }

	public static void main(String[] args) {
		PolyInterface p = new PolyInterface();
    	p.method1();
    	p.method2();
	}

}
