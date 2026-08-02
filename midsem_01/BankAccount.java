package midsem_01;

public class BankAccount {
int accNo;
String name;
double balance;

	public static void main(String[] args) {
		
	}
	void deposit(double amount) {
		if (amount>0) {
			balance+=amount;
			
		}
	}

}
