package labassignment1;

public class Sum1D {

	public static void main(String[] args) {
		        int[] array={1,2,3,4,5};
		        int sum=0;
		        for(int i=0;i<array.length;i++){
		            sum = sum+array[i];
		        }
		        System.out.println("The sum of the 1D array is: "+sum);
		        double average= sum/array.length;
		        System.out.println("The average of the 1D array is: "+average);
		    }
		}

