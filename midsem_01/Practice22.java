package midsem_01;
import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a:");
		int a=sc.nextInt();
		System.out.print("Enter b:");
		int b=sc.nextInt();
		System.out.print("Enter c:");
		int c=sc.nextInt();
		
		double d=b*b-4*a*c;
		double x=(-b+Math.sqrt(d))/2*a;
		double y=(-b-Math.sqrt(d))/2*a;
		
		if(d>0) {
			System.out.println("The roots of the equation is "+x+y);
			
		}
		else if(d==0) {
			System.out.println("The roots of the equation is "+x);
		}
		else {
			System.out.println("no real roots of the equation ");
		}
		
	}

}
