package midsem_01;
import java.util.Scanner;

public class Practice18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number:");
		int x=sc.nextInt();
		
		if(x%10==0 ||x%10==1 || x%10==2 || x%10==3) {
			System.out.println("Hall A");
		}
		else if(x%10==4 || x%10==5 || x%10==6) {
			System.out.println("Hall B");
		}
		else if(x%10==7 || x%10==8 || x%10==9  ) {
			System.out.println("Hall c");
		}
		

	}

}
