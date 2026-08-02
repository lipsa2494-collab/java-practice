package midsem_01;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		int h=n/100;
		int t=(n%100)/10;
		int o=(n%100) % 10;
		int sum=h+t+o;
		
		System.out.println("The sum of the digits of "+ n+ " is"+sum);
		
		

	}

}
