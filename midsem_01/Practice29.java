package midsem_01;
import java.util.Scanner;
public class Practice29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				s+=i;
			}
			
		}
		if(s==n) {
			System.out.println(n+" is a perfect number.");
		}
		else {
			System.out.println(n+ " is not a perfect number.");
		}
		
	}

}
