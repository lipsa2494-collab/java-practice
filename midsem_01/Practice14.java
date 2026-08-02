package midsem_01;
import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int x=sc.nextInt();
		if(x<0) {
			System.out.println("The absolute value of "+x+" is "+-x);
		}
		else {
			System.out.println("The absolute value of "+x+" is "+x);
		}

	}

}
