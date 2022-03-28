package exercises.interview_exercises.other;
/*
  Create a class called other.Account which maintains the balance of account
   it should allow user to deposit and withdraw money from the account
    whenever the balance goes to 0 or below 0 it should display exception -->"SufficientFundNotAvailable";
   */

class Account{
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public Account(String accountHolder, String accountNumber) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        if(amount <= 0){
            throw new RuntimeException("Invalid amount entered: "+amount);
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(balance <= 0 ){
            throw new RuntimeException("Sufficient Fund Not Available");
        }
        this.balance -= amount;
    }

    public void displayBalance(){
        System.out.println("Your available balance is: "+balance);
    }

}

public class CustomClass_Account {
}
