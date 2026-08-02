package endsem1;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=10;
		for(int i=1;i<=10;i++) {
			for (int j=1;j<=n;j++) {
				if((i+j)%2==0) {
					System.out.print("# ");
				}
				else {
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}

	}

}
