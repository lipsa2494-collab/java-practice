package endsem1;
import java.util.Scanner;
class BankAccount{
	int ac_no;
	String name;
	double balance;
	Scanner sc=new Scanner(System.in);
	void Create_Account() {
		System.out.println("Enter the account holder name:");
		name=sc.nextLine();
		System.out.println("Enter account number:");
		ac_no=sc.nextInt();
		System.out.println("Enter initial balance:");
		balance=sc.nextDouble();
		System.out.println("Account created successfully");
				
	}
	void Deposit() {
		System.out.println("Enter amount to deposit:");
		double amt=sc.nextDouble();
		balance+=amt;
		System.out.println("Amount deposited successfully");
	}
	void withdraw() {
		System.out.println("Enter amount to withdraw:");
		double withdraw=sc.nextDouble();
		if(withdraw<balance) {
			balance-=withdraw;
			System.out.println("Amount withdrawn successfully");
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}
	void display() {
		System.out.println("Account holder name:"+name);
		System.out.println("Account no:"+ac_no);
		System.out.println("Available balance:"+balance);
		
	}
	void checkBalance() {
		System.out.println("Current balance:"+balance);
	}
}

public class BankingManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount ac=new BankAccount();
		int choice=0;
		while(choice!=6) {
		System.out.println("__Banking Management System__");
		System.out.println("1:Create new account\n2:Deposit amount\n3:Withdraw amount \n4:Display account details\n5:Check account balance\n6:Exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			ac.Create_Account();
			break;
		case 2:
			ac.Deposit();
			break;
		case 3:
			ac.withdraw();
			break;
		case 4:
			ac.display();
			break;
		case 5:
			ac.checkBalance();
			break;
		case 6:
			System.out.println("Thank you for using the banking system");
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
				
			
		}
		}	
		
	}

}
