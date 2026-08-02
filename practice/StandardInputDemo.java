package practice;
import java.util.Scanner;
import java.io.*;
public class StandardInputDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		if (sc.hasNextInt()) {
			int n=sc.nextInt();
			System.out.println("The number is: "+n);
		}
		else {
			System.out.println("Invalid Input");
		}
		System.out.println("Program completed");
	}

}
