package midsem_01;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=sc.nextInt();
		int c=1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j) % 2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		

	}

}
