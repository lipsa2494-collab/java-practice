package midsem_01;
import java.util.Scanner;
public class Practice6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temp in celcius:");
		float c=sc.nextFloat();
		System.out.print("Enter temp in Fahrenheit:");
		float f=sc.nextFloat();
		float c_f=(c*9/5)+32;
		float f_c=(f-32)*5/9;
		System.out.println(c+" celcius to Fahrenheit is "+c_f);
		System.out.println(f+" Fahrenheit to celcius is "+f_c);
				
	}

}
