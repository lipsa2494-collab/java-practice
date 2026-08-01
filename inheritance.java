import java.util.Scanner;
class Person1{
	String name;
	int age;
	void set() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age:");
		name=sc.nextLine();
		age=sc.nextInt();
	}
	void get() {
		System.out.println("Name: "+" "+"Age: "+age);
	}
}
class student extends Person1 {
	String roll;
	Double mark;
	String branch;
	
	void set() {
		super.set();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter roll,mark,branch");
		roll=sc.next();
		mark=sc.nextDouble();
		branch=sc.next();
	}
	void get() {
		super.get();
		System.out.println("Roll no: "+roll+" "+"mark:"+mark+" "+"branch"+branch);
	}
	
}
public class inheritance {
	public static void main(String[] args) {
		student S1=new student();
		S1.set();
		S1.get();
		
	}

}
