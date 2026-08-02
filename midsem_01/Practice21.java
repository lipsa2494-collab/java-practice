package midsem_01;
import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=0;
		for(int n=101;n<=200;n++) {
			if(n%7==0) {
				System.out.println(n);
				s+=n;
			}
			
		}
		System.out.println("sum"+s);
	}

}
