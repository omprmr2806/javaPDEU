public class NetBankingPayment implements Payment {
    private double amount;

    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Net Banking payment of " + amount + " made.");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Net Banking receipt generated.");
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Mode: Net Banking");
        System.out.println("Amount: " + amount);
    }
}
