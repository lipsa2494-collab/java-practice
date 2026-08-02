package midsem_01;
import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\n 1-circle\n 2-Rectangle\n 3-Triangle");
		int x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("Enter radius");
			double r=sc.nextDouble();
			System.out.println("The area of the circle is "+2*3.14*r);
			break;
		case 2:
			System.out.println("Enter length");
			double l=sc.nextDouble();
			System.out.println("Enter breadth");
			double b=sc.nextDouble();
			System.out.println("The area of the rectangle is "+(l*b));
			break;
		case 3:
			System.out.println("Enter base:");
			double p=sc.nextDouble();
			System.out.println("Enter height:");
			double h=sc.nextDouble();
			System.out.println("The area of triangle is "+(1/2*p*h));
			break;
		default:
			System.out.print("Invalid choice");
		}
		
	}

}
