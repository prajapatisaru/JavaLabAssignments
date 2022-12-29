package labassignment1;

public class MatrixOperation {
		    public static void Addition(int a[][],int b[][]){
		        int c[][]=new int[3][3];  //3 rows and 3 columns  
		int d[][] = new int[3][3];

		        System.out.println("The sum of two matrix is: ");
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    

		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		    }
		    public static void Subtraction(int a[][],int b[][]){
		         int c[][]=new int[3][3];  //3 rows and 3 columns  
		int d[][] = new int[3][3];
		        System.out.println("The difference of two matrix is: ");
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]-b[i][j];    

		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		    }
		static void Multiplication(int[][] a,int[][] b){
		    int[][] rslt = new int[3][3];
		        System.out.println(
		            "Multiplication of given two matrices is:");
		        int i, j, k;
		        for (i = 0; i < 3; i++) {
		            for (j = 0; j < 3; j++) {
		                rslt[i][j] = 0;
		                for (k = 0; k < 3; k++)
		                    rslt[i][j] += a[i][k] * b[k][j];
		                System.out.print(rslt[i][j] + " ");
		            }
		            System.out.println("");
		        }
		}
		    public static void main(String[] args) {
		        //creating two matrices  
		int a[][]={{3,2,5},{3,4,5},{4,6,5}};    
		int b[][]={{1,2,3},{2,2,4},{2,4,4}};    
		Addition(a,b);
		Subtraction(a,b);
		Multiplication(a,b);
		    }
	}


