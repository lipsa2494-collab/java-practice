package midsem_01;
import java.util.Scanner;
public class Practice7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter five numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		int small=a;
		if(b<small) {
			small=b;
		}
		if(c<small) {
			small=c;
		}
		if(d<small) {
			small=d;
		}
		if(e<small) {
			small=e;
		}
		System.out.println("The smallest number among five number is"+small);
		
		

	}

}
