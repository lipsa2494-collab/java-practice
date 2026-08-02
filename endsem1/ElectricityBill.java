package endsem1;
import java.util.Scanner;

public class ElectricityBill {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elec consumed in units:");
	double E=sc.nextDouble();
	double bill=0;
	if (E>=0 && E<=100) {
		bill+=E*5;
	}
	else if(E<=200) {
		bill+=(E-100)*7;
	}
	else if (E>200) {
		bill+=100*5+100*7+(E-200)*10;
	}
	else {
		System.out.println("Invalid input");
	}
	System.out.println("The electricity bill is"+bill);
	

}
}