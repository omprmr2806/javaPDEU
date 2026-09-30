package bank.application;

import bank.accounts.SavingsAccount;
import bank.operations.BankOperations;

public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount account =
                new SavingsAccount("SB1001", "Om", 10000);

        BankOperations operations = account;

        operations.deposit(5000);
        operations.withdraw(3000);
        operations.checkBalance();

        System.out.println();
        account.displayAccountDetails();

        /*
        Access modifier demonstration:

        account.accountNumber = "SB9999";
        -> ERROR: accountNumber is private.

        account.accountHolderName = "New Name";
        -> ERROR here because BankApplication is in a different package.
           A protected member is directly accessible from a subclass or
           same package, not from an unrelated class in another package.

        account.displayAccountDetails();
        -> Works because the method is public.
        */
    }
}
