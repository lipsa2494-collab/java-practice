package endsem1;
import java.util.Scanner;
public class Loop1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int N=sc.nextInt();
		int sum=0;
		for (int i=1;i<=N;i++) {
			sum+=i;
		}
		System.out.println("The sum of nums is "+sum);

	}

}
