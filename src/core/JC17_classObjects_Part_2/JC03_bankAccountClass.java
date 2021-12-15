package core.JC17_classObjects_Part_2;

/**
 * @author esalkan
 */
public class JC03_bankAccountClass {

	// Creating the fields
	double balance;
	String accountHolder;
	int accountNumber;

	// Create some methods for this class
	// Depositing the money and update the balance
	public void deposit(double amount) {
		System.out.println("Depositing $ " + amount + " to " + accountNumber);
		balance += amount;
	}

	// Withdraw the money and update the balance and if the account is not awailable
	// charge +35$
	public void withdraw(double amount) {
		System.out.println("Withdrawing $ " + amount + " from " + accountNumber);
		balance -= amount;

		if (balance < 0) {
			balance -= 35; // If balance is becoming - owerdraft charge from bank
		}
	}

	// Show the balance status
	public void showBalance() {
		System.out.println("\n+-----------------------------+\n");
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Balance : $" + balance);
		System.out.println("\n+-----------------------------+\n");
	}

	// Shopping/Purchasing something
	public void charge(double price, String item) {
		// If balance is allow us to purchase we purchase something
		if (balance >= price) {
			System.out.println("Buying " + item + " for $ " + price + " from " + accountNumber);
			balance -= price;
		} else {
			System.out.println("Insufficent funds to purchase " + item + " from " + accountNumber);
		}
	}

}
