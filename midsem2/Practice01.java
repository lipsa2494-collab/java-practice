package midsem2;
import java.util.*;
class 	Person01{
	String name;
	int roll;
	void set() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and roll no:");
		name=sc.next();
		roll=sc.nextInt();
	}
	void get() {
		System.out.println("Name:"+name+" Roll no: "+roll);
	}
}
class Student01 extends Person01{
	Double mark;
	String branch;
	void set() {
		super.set();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark and branch: ");
		mark=sc.nextDouble();
		branch=sc.next();
	}
	void get() {
		super.get();
		System.out.println("Mark: "+mark+" Branch: "+branch);
	}
}
public class Practice01 {
	public static void main(String[] args) {
		Student01 s=new Student01();
		s.set();
		s.get();

	}

}
