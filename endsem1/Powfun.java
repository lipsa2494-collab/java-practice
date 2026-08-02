package endsem1;
import java.util.Scanner;
public class Powfun {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(pow(a,b));
	
	}
	public static int pow(int a,int b) {
		int p=1;
		for(int i=1;i<=b;i++) {
			p*=a;
		}
		return p;
	}

}
