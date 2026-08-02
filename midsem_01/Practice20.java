package midsem_01;
import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int r=sc.nextInt();
		int c=1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(c);
				c++;
			}
			System.out.println("");
		}
		

	}

}
