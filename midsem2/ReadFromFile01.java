package midsem2;
import java.util.Scanner;
import java.io.*;
public class ReadFromFile01 {
	public static void main(String[] args) {
		try {
		FileWriter fw=new FileWriter("Filew.txt");
        fw.write("I am a student of Iter");
        fw.close();
	}
		catch(IOException i) {
			System.out.println(i);
		}
//		try {
//			Scanner sc=new Scanner(new File("Filew.txt"));
//			if(sc.hasNextLine()) {
//				String s=sc.nextLine();
//				System.out.println(s);
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		try {
			FileReader fr=new FileReader("Filew.txt");
			int v;
			while((v=fr.read())!=-1) {
				System.out.print((char)v);
			}
			System.out.println();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
