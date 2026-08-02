package endsem1;
import java.util.Scanner;
public class MinIng {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(maxm(a,b));
		
		System.out.println("Enter two numbers:");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		System.out.println(maxm(x,y));
		System.out.println("Enter two numbers:");
		double m=sc.nextDouble();
		double n=sc.nextDouble();
		System.out.println(maxm(m,n));
		

	}
	public static int maxm(int a,int b) {
		return ((a>b)?a:b);
	}
	public static float maxm(float a,float b) {
		return ((a>b)?a:b);
	}
	public static double maxm(double a,double b) {
		return ((a>b)?a:b);
	}
	

}
