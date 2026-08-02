package midsem2;
import java.io.*;
public class Exception02 {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("filep.txt");
			String s="I am a student of ITER";
			fw.write(s);
			fw.close();
			FileReader fr=new FileReader("filep.txt");
			int v;
			while((v=fr.read())!=-1) {
				System.out.print((char)v);
			}
			System.out.println(" ");
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Program executed successfully");
	}

}
