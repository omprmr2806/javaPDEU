package bank.accounts;

public class SpecialSavingsAccount extends SavingsAccount {

    public SpecialSavingsAccount(String accountNumber,
                                 String accountHolderName,
                                 double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void demonstrateProtectedAccess() {
        // accountHolderName is protected in the parent class.
        System.out.println("Protected account holder name: " + accountHolderName);
        accountHolderName = accountHolderName + " (Special)";
        System.out.println("Updated protected name: " + accountHolderName);
    }
}
