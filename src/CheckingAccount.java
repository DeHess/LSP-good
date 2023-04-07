public class CheckingAccount extends BankAccount{

    public CheckingAccount(int startingAmount) {
        super(startingAmount);
    }

    //Tax Free Withdrawal
    @Override
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
