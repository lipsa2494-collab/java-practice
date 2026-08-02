package endsem1;
import java.util.Scanner;
public class PrimeFactRecursive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		System.out.println(prime(n));
		
	}
	public static int prime(int n) {
		if(n==1) {
			return 1;
		}
		else {
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					System.out.print(i+" ");
					return prime(n/i);
				}
			}
		}
		return 0;
	}

}
