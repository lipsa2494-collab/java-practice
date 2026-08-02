package midsem_01;
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int n=1;n<=500;n++) {
			int a=n/100;
			int b=(n%100)/10;
			int c=(n%100)%10;
			if(((a*a*a)+(b*b*b)+(c*c*c))==n) {
				System.out.println(n);
			}
			
		}
		
		

	}

}
