package midsem_01;
import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sides of the triangle:");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a==b && a==c) {
			System.out.println("it is an equilateral triangle.");
		}
		else if((a==b && a!=c)||(c==a && a!=b)||(b==c && c!=a)){
			System.out.println("It is an issoscele triangle");
		}
		else if(a!=b && b!=c && c!=a) {
			System.out.println("It is a scelene triangle");
			
		}
			
		
		
		

	}

}
