package exception;
import java.io.*;
public class Exception1 {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("GdFile.txt");
			String s="I am a student of ITER";
			fw.write(s);
			fw.close();
			FileReader fr=new FileReader("GdFile.txt");
			int v;
			while ((v=fr.read())!=-1) {
				System.out.print((char)v);
			}
			System.out.println();
			fr.close();
		}
		catch(IOException i) {
			System.out.println("Exception handled");
		}
		System.out.println("Program executed successfully");

	}

}
