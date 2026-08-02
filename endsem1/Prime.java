package endsem1;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		for(int n=2;n<=100;n++) {
			Boolean isPrime=true;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
				isPrime=false;
				break;
			}
			}
			if (isPrime) {
				System.out.println(n+" ");
			}
		}
		
		
		
	}

}
