package endsem1;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=2*i-1;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
