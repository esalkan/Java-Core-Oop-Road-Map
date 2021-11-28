package core.reviews.week_04;

/**
 * @author esalkan
 */
public class _15_Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_14_bankAccount accountOne = new _14_bankAccount();

		accountOne.accountHolderName = "James Bond";
		accountOne.pin = 1007;
		accountOne.balance = 1_000_000;
		accountOne.accountNumber = 1007007007;

		System.out.println(accountOne.getBalance(1111));

		System.out.println(accountOne.getBalance(1007));

		int x = 5;
		x = 0;

		accountOne = new _14_bankAccount(); // when I do this James Bond object is unrefenced->Goes to Garbage
		System.out.println(accountOne.accountHolderName);

		accountOne.accountHolderName = "Mike Smith";
		accountOne.pin = 1007;
		accountOne.balance = 1_000_000;
		accountOne.accountNumber = 1007007007;

		accountOne = null;

		System.out.println(accountOne); // prints null
		// System.out.println(accountOne.accountNumber); Gives null pointer exception
	}

}
