package oop.JOOP33_Class_Objects_Constructors;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP08_BankAccountClass {

	// Create a Instance Variable
	double balance;

	// Create a constructor sets the starting balance from 0.0
	public OOP08_BankAccountClass() {
		balance = 0.0;
	}

	// Create a constructor sets the starting balance to the value passes as an
	// argument
	public OOP08_BankAccountClass(double startBalance) {
		balance = startBalance;
	}

	// Create a constructor sets the starting balance to the value in the string
	// argument
	public OOP08_BankAccountClass(String str) {
		this.balance = Double.parseDouble(str);
	}

	public void deposit(String str) {
		balance = balance + Double.parseDouble(str);
	}

	public double getBalance() {
		return balance;
	}
}
