package bank.application;

import bank.accounts.SpecialSavingsAccount;

public class BankApplication {
    public static void main(String[] args) {
        SpecialSavingsAccount account =
                new SpecialSavingsAccount("SS1001", "Om", 20000);

        account.deposit(5000);
        account.withdraw(2000);
        account.checkBalance();

        System.out.println();
        account.displayAccountDetails();

        System.out.println("\nProtected member through subclass:");
        account.demonstrateProtectedAccess();

        /*
        Direct access from this class to account.accountHolderName
        is not allowed because BankApplication is in a different package
        and is not a subclass.

        account.accountHolderName = "Test";
        -> Compiler error.

        The subclass SpecialSavingsAccount can access the protected member.
        */
    }
}
