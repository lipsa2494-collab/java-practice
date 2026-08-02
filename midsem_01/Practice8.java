package midsem_01;
import java.util.Scanner;
public class Practice8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int a=n-((n/10)*10);
		int b=(n/10)-((n/10)/10*10);
		int c=(n/10)/10;
		System.out.println("The reverse of the number:"+a+b+c);
		int x= n%10;
		int y=(n/10)% 10;
		int z=(n/10)/10;
		
		System.out.println("The reverse of the number is"+x+y+z);
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
			
		}
		System.out.println("The sum of the number is"+sum);
		
		
	
		
	}

}
