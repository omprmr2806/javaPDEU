abstract class BankAccount {
    protected String accountNumber;
    protected String customerName;
    protected double balance;

    // Final variable.
    final String BANK_NAME = "ABC Bank";

    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Final method cannot be overridden.
    public final void displayBankInformation() {
        System.out.println("Bank Name: " + BANK_NAME);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    protected double interestRate;

    public SavingsAccount(String accountNumber, String customerName,
                           double balance, double interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public void displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + calculateInterest());
    }

    /*
    If you try to override displayBankInformation(), Java gives a
    compiler error because the method in BankAccount is final.

    @Override
    public void displayBankInformation() { }
    */
}

class PremiumSavingsAccount extends SavingsAccount {
    private double cashbackPercentage;

    public PremiumSavingsAccount(String accountNumber, String customerName,
                                 double balance, double interestRate,
                                 double cashbackPercentage) {
        super(accountNumber, customerName, balance, interestRate);
        this.cashbackPercentage = cashbackPercentage;
    }

    @Override
    public double calculateInterest() {
        // Premium account uses a higher interest rate.
        return balance * (interestRate + 1.0) / 100;
    }

    public double calculateCashback(double amount) {
        return amount * cashbackPercentage / 100;
    }
}

// Final class cannot be extended.
final class BankRules {
    public void displayRules() {
        System.out.println("Bank Rules: Maintain sufficient balance and follow bank policies.");
    }
}

/*
If another class tries to extend BankRules, Java gives a compiler error:

class AnotherBank extends BankRules { }
*/

public class Lab3_2_BankingDemo {
    public static void main(String[] args) {
        SavingsAccount savings =
                new SavingsAccount("SA1001", "Om", 50000, 5.0);

        savings.deposit(5000);

        System.out.println("\n=== Savings Account ===");
        savings.displayAccountDetails();
        System.out.println("Interest = " + savings.calculateInterest());

        PremiumSavingsAccount premium =
                new PremiumSavingsAccount("PA1001", "Om", 100000, 6.0, 2.0);

        premium.deposit(10000);

        System.out.println("\n=== Premium Savings Account ===");
        premium.displayAccountDetails();
        System.out.println("Interest = " + premium.calculateInterest());

        double transaction = 5000;
        System.out.println("Cashback on " + transaction + " = "
                + premium.calculateCashback(transaction));

        System.out.println("\n=== Final Method ===");
        savings.displayBankInformation();

        // Uncommenting the following line causes a compiler error:
        // savings.BANK_NAME = "Another Bank";
    }
}
