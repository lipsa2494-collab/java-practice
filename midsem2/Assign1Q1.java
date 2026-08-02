package midsem2;
class Employee1{
	String name;
	Double salary;
	Employee1(String nm,Double s){
		name=nm;
		salary=s;
	}
	void DisplayDetails() {
		System.out.println("Name: "+name+" Salary: "+salary);
	}
}
class Programmer1 extends Employee1{
	int bonus;
	Programmer1(String nm,Double s,int b){
		super(nm,s);
		bonus=b;
	}
	void displayMethodDetails() {
		super.DisplayDetails();
		System.out.println("Bonus: "+bonus);
	}
}
public class Assign1Q1 {
	public static void main(String[] args) {
		Programmer1 p=new Programmer1("Pravanjan",78000.45,1000);
		p.displayMethodDetails();
	}

}
