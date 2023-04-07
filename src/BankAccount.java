public class BankAccount {

    protected int balance;

    public BankAccount(int startingAmount) {
        this.balance = startingAmount;
    }

    //Taxed Withdrawal
    public void withdraw(int amount) throws IllegalArgumentException {
        int tax = (int) (amount * 0.05);
        balance = (balance - amount);
        balance = balance - tax;
    }

    public int getBalance() {
        return this.balance;
    }
}
