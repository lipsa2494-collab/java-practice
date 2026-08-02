package midsem_01;
import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.print("Binary Equivalent:");
		Binary(n);
	}
	public static void Binary(int n) {
		if (n==0) {
			return ;
		}
		else {
			Binary(n/2);
			System.out.print(n%2);
		}
	}

}
