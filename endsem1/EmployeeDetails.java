package endsem1;
import java.util.Scanner;
class Employee {
	String Employee_name;
	String Emp_id;
	double emp_salary;
	Scanner sc=new Scanner(System.in);
	void Employee_details() {
		System.out.println("Enter employee name:");
		Employee_name=sc.nextLine();
		System.out.println("Enter employee id:");
		Emp_id=sc.nextLine();
		System.out.println("Enter employee salary:");
		emp_salary=sc.nextDouble();
	}
	void display() {
		System.out.println(Employee_name+"\t"+Emp_id+"\t"+emp_salary);
	}
	
}
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int num=sc.nextInt();
		Employee []emp=new Employee[num];
		for (int i=0;i<num;i++) {
			emp[i]=new Employee();
			System.out.println("Enter employee details:");
			emp[i].Employee_details();
			
		}
		for(int i=0;i<num;i++) {
			emp[i].display();
		}
		

	}

}
