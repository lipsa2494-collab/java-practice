package endsem1;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter original price:");
		double oprice=sc.nextDouble();
		System.out.println("Enter discount percentage:");
		int dper=sc.nextInt();;
		double fprice=(oprice*(100-dper)/100);
		System.out.println("The final price is "+fprice);
		
	}

}
