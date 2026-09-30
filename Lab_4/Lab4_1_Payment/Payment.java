public interface Payment {
    void makePayment(double amount);
    void generateReceipt();
    void displayPaymentDetails();
}
