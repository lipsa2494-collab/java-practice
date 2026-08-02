package practice;
import java.util.*;
import java.io.*;
public class ReadFileDemo3 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			FileWriter fw=new FileWriter("ReadFile.txt");
			for(int i=0;i<5;i++) {
				System.out.println("Enter an integer: ");
				int n=sc.nextInt();
				fw.write(n+" ");
			}
			fw.close();
		}
		catch(IOException i) {
			
		}
		try {
			Scanner sc=new Scanner(new File("ReadFile.txt"));
			while(sc.hasNextInt()) {
				int x=sc.nextInt();
				System.out.print(x+" ");
			}
			System.out.println();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program executed successfully");

	}

}
