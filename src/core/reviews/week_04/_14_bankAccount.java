package core.reviews.week_04;

public class _14_bankAccount {
	String accountHolderName;
	int pin;
	double balance;
	long accountNumber;

	public double getBalance(int inputPin) {
		if (pin == inputPin) {
			return balance;
		}
		return -1;
	}
}
