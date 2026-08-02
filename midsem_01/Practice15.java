package midsem_01;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\n 1-convert rupees to us dollar\n 2-convert rupees to Euro\n 3-convert rupees to japanese yen");
		char ch=sc.next().charAt(0);
		System.out.println("Enter amount in rupees:");
		double amount=sc.nextDouble();
		switch(ch) {
		case 1:
			System.out.println("in us dollar"+amount*0.011);
			break;
		case 2:
			System.out.println("in Euro"+amount*0.098);
			break;
		case 3:
			System.out.println("in Japanese yen"+amount*1.7374);
			break;
		default:
			System.out.println("Invalid choice");
				
		}
		
			
		
		

	}

}
