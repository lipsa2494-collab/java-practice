package midsem_01;
import java.util.Scanner;

public class Practice27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of terms:");
		int n=sc.nextInt();
		int f1=0;
		int f2=1;
		for(int i=1;i<=n;i++) {
			System.out.print(f1+" ");
			int f3=f2+f1;
			f1=f2;
			f2=f3;
			
		}

	}

}
