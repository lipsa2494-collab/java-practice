package endsem1;
import java.util.Scanner;
public class PrimeN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		
		int N=sc.nextInt();
		for(int i=2;i<=N;i++) {
			int count=0;
			for (int j=1;j<=i;j++) {
				if (i%j==0) {
					count+=1;
				}
			}
			if (count==2) {
				System.out.println(i+" ");
			}
			
	}

	}
}
