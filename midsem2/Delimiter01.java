package midsem2;
import java.util.Scanner;
public class Delimiter01 {
	public static void main(String[] args) {
		String s="Iwow live wowin wowbhubaneswar";
		Scanner sc=new Scanner(s).useDelimiter("wow");
		while(sc.hasNext()) { 
		String st=sc.next();
			System.out.print(st);
		}
		System.out.println();
		System.out.println("Program executed successfully");

	}

}
