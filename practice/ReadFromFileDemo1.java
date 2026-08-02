package practice;
import java.io.*;
import java.util.Scanner;
public class ReadFromFileDemo1 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(new File("readFile.txt"));
			while(sc.hasNextInt()) {
				int c=sc.nextInt();
				System.out.println("Number is: ");
			}
		}
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
		System.out.println("Program completed");

	}

}
