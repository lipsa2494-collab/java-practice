package endsem1;
import java.util.Scanner;
public class AreaOverloading {

	public static void main(String[] args) {
		sum();
		}
	
	public static void sum() {
		int n=12345;
		int r;
		int s=0;
		while(n!=0) {
			r=n%10;
			s+=r;
			n=n/10;
		}
		System.out.println(s);
		
	}

}
