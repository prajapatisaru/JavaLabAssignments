package labassignment1;
class Demo {
    public void example(){
        System.out.println("This is Demo Class");
    }
}
public class PolyNonAbstract extends Demo{
		 final int a=10;
		    @Override
		    public void example(){
		        System.out.println("This is Polymorphism using NonAbstract class");
		    }
		    public static void main(String[] args) {
		        final int B;//b become constant
		        //once assigned any value, that variable become constant
		        B=20;
		        PolyNonAbstract pna = new PolyNonAbstract();
		        pna.example();
		        Demo s = new Demo();
		        Demo f = new PolyNonAbstract();
		        f.example();
		        s.example();
	}
}
