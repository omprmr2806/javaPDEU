public class CreditCardPayment implements Payment {
    private double amount;

    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Credit Card payment of " + amount + " made.");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card receipt generated.");
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Mode: Credit Card");
        System.out.println("Amount: " + amount);
    }
}
