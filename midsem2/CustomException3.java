package midsem2;
import java.io.*;
import java.util.Scanner;
public class CustomException3 {
	public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(new File("file1.txt"));
		if(sc.hasNextInt()) {
			int n=sc.nextInt();
			System.out.println(n);
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	catch(FileNotFoundException f) {
		//f.printStackTrace();
		System.out.println(f);
	}

	}

}
