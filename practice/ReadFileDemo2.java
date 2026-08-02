package practice;
import java.io.*;
import java.util.*;

public class ReadFileDemo2 {
	static void Write(){
		try {
			FileWriter fw=new FileWriter("File5.txt");
			String s="I live in bhubaneswar";
			fw.write(s);
			fw.close();
		}
		catch(IOException f) {
			System.out.println("Exception handled");
		}
	}
	public static void main(String[] args) {
	try {
		Write();
		Scanner sc=new Scanner(new File("File5.txt"));
		while(sc.hasNextLine()) {
			String a=sc.nextLine();
			System.out.println(a);
		}
		sc.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("Program executed successfully");
	}

}
