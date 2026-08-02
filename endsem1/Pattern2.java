package endsem1;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
