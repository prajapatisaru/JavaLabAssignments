package labassignment1;
import java.io.*;
public class Readfile {
	public static void main(String[] args) {
	try {
		RandomAccessFile file = new RandomAccessFile("E:\\Documents\\Java programs\\Text1.txt", "r");
		String str;
		while ((str = file.readLine()) != null) {
			System.out.println(str);
		}
		file.close();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}}

