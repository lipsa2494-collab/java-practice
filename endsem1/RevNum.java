package endsem1;
import java.util.Scanner;
public class RevNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int t=n;
		int rev=0;
		int rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("The reverse of the number is :"+rev);
		
		
		
	}

}
