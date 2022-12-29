package labassignment1;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class Duplicatefile {
   public static void main(String[] args) throws IOException {
	   File f = new File("E:\Source.txt");
	   FileInputStream fin = new FileInputStream(f);
	      byte bytes[]=new byte[(int)f.length()];
	      fin.read(bytes);
	      System.out.println("Data Read!!");
	      File outFile2=new File("E:\\Destination.txt");
	      FileOutputStream fout2 = new FileOutputStream(outFile2);
	      for(byte i:bytes)
	      {
	    	  fout2.write(i);
	    	  fout.write(i);
	      }
	      fout2.flush();
	      System.out.println("Data Duplicated!!");    
   }
}
