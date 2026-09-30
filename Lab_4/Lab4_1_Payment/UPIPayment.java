public class UPIPayment implements Payment {
    private double amount;

    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("UPI payment of " + amount + " made.");
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI receipt generated.");
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Mode: UPI");
        System.out.println("Amount: " + amount);
    }
}
