public class SavingsAccount extends BankAccount{

    public SavingsAccount(int startingAmount) {
        super(startingAmount);
    }

    //No-Credit Withdrawal
    @Override
    public void withdraw(int amount) {
        if (amount >= balance) {
            throw new IllegalArgumentException();
        }
        balance = balance - amount;
    }
}
