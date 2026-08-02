package midsem_01;
import java.util.Scanner;

public class Practice25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int d=n;
		int sum=0;
		int f=1;
		while (n!=0) {
			int r=n%10;
			for(int i=2;i<=r;i++) {
				f*=i;				
			}
			sum+=f;
			n/=10;
			f=1;
			
		}
		if(sum==d) {
			System.out.println(d+" is an strong number.");
		}
		else {
			System.out.println(d+" is not an strong number.");
		}

	}

}
