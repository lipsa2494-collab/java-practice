package practice;
import java.util.*;
public class ReadFromString {
	public static void main(String[] args) {
		String str="I am a student of ITER";
		Scanner sc=new Scanner(str);
		while(sc.hasNext()) {
			String strn=sc.next();
			System.out.print(strn+" ");
		}
		System.out.println();
		System.out.println("Program completed");

	}

}
