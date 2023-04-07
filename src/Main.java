public class Main {

    public static void main(String[] args) {
        BankAccount superclassAccount = new BankAccount(1000);
        SavingsAccount subclassAccount1 = new SavingsAccount(1000);
        CheckingAccount subclassAccount2 = new CheckingAccount(1000);

        withdraw(superclassAccount, 2000);
        System.out.println("Bank Account (Superclass): " + superclassAccount.getBalance());
        System.out.println("===================================================");
        withdraw(subclassAccount1, 2000);
        System.out.println("Savings Account (Subclass 1): " + subclassAccount1.getBalance());
        System.out.println("===================================================");
        withdraw(subclassAccount2, 2000);
        System.out.println("Checking Account (Subclass 2): " + subclassAccount2.getBalance());
        System.out.println("===================================================");
    }

    public static void withdraw(BankAccount account, int amount) {
        try {
            account.withdraw(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Tried withdrawing too much money from " + account.getClass()+ "!!!");
        }
    }
}




