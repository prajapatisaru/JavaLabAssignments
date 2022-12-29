package labassignment1;
public class Array {

    public static void main(String[] args) {
        int [] array = {2,3,4,5,6,7,8,9};
     if(balanced(array)==1)
        System.out.println("The  array is balanced");
        else
        System.out.println("The  array is not balanced");

			 }
    public static int balanced(int [] array ){
        int c=array.length,i;
        for( i=0;i<array.length;i++)
            if(!(i%2==array[i]%2))
                break;
                if(c==i)
                    return 1;
                    else
                    return  0;
        }
	}


