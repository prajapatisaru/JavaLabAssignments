package labassignment1;
import java.io.*;
import java.util.*;

public class FileQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("if you want to close the program then write 'quit' ");
	try {
		Scanner sc=new Scanner(System.in);
		String val="";
		RandomAccessFile file = new RandomAccessFile("text4.txt", "rw");
		do {
			file.writeUTF(val);
			val=sc.nextLine();
		}while(!val.contentEquals("quit"));
		file.close();
	} catch (IOException e) {
		e.printStackTrace();

	}

}
