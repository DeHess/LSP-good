public class CheckingAccount extends BankAccount{

    public CheckingAccount(int startingAmount) {
        super(startingAmount);
    }

    //Taxed Withdrawal
    @Override
    public void withdraw(int amount) {
        int tax = (int) (amount * 0.05);
        balance = (balance - amount);
        balance = balance - tax;
    }
}
