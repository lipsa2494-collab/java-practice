package midsem2;
import java.util.Scanner;
public class ReadFromStrin01 {

	public static void main(String[] args) {
		int sum=0;
		int c=0;
		String s="10 20 30 40 50";
		Scanner sc=new Scanner(s);
		while(sc.hasNext()) {
			String r=sc.next();
			sum+=Integer.parseInt(r);
			c+=1;
		}
		System.out.println("sum="+sum);
		System.out.println("Average="+sum/c);

	}

}
