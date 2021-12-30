package core.reviews.week_04;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
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
