package midsem_01;
import java.util.Scanner;

public class Practice28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int f=1;
		int s=0;
		int x=n;
		while(n!=0) {
			int r=n%10;
		
		for(int i=1;i<=r;i++) {
			f=f*i;
		}
		s=s+f;
		n/=10;
		f=1;
		}
		if(x==s) {
			System.out.println(x+"is a strong number.");
		}
	}

}
