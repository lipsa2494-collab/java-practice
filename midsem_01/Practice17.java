package midsem_01;
import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\n 1-celcius to fahrenheit\n 2-Fahrenheit to celcius \n 3-celcius to kelvin:");
		int x=sc.nextInt();
		switch(x){
		case 1:
			System.out.println("Enter temp in celcius:");
			double c=sc.nextDouble();
			double c_f=(c*9/5)+32;
			System.out.println("celcius to "+c_f);
			break;
		
		case 2:
			System.out.println("Enter temp in fahrenheit:");
			double f=sc.nextDouble();
			double f_c=(f-32)*5/9;
			System.out.println("Fahrenheit to celcius: "+f_c);
			break;
		case 3:
			System.out.println("Enter temp in  celcius:");
			double cl=sc.nextDouble();
			double c_k=(cl+273.15);
			System.out.println("celcius to kelvin:"+c_k);
			
			
		}
		
		
	}

}
