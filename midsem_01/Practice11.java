package midsem_01;
import java.util.Scanner;
public class Practice11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any alphabet:");
		char ch=sc.next().toLowerCase().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.print(ch+" is a vowel");
		}
		else {
			System.out.println(ch+" is a consonant");
		}
		
		
	}

}
