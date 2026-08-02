package prog1;
import java.util.Scanner;
public class primerecursive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Prime factors are:");
		Prime(n);
	}
	
	public static int Prime(int n) {
		if (n==1) {
			return 1;
		}
		else  {
			for(int i=2;i<=n;i++) {
				if (n % i==0) {
					System.out.print(i+" ");
					return Prime(n/i);
					
				}
				
			}
			return 0;
			
			
		}
		
	}

}
