package endsem1;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grade:");
		char gr=sc.next().toUpperCase().charAt(0);
		switch (gr) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Pass");
			break;
		case 'E':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");
			
			
		
		}
		
		
		

	}

}
