package live_reviews.week_05.endOfTheWeek_liveReviewSession;

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
