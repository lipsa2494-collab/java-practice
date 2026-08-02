package midsem_01;
import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the electricity consumed:");
		double E=sc.nextDouble();
		if(E>0 && E<=100) {
			System.out.println("The electiciry bill is rs "+(E*5));
			
		}
		else if(E>100 && E <=200) {
			System.out.println("The electricity bill will be rs "+(E*7));
		}
		else {
			System.out.println("The electricity bill would be rs "+(E*10));
		}
		
	}

}
