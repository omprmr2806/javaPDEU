public class PaymentDemo {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.makePayment(1500);
        p.generateReceipt();
        p.displayPaymentDetails();

        System.out.println();

        p = new UPIPayment();
        p.makePayment(750);
        p.generateReceipt();
        p.displayPaymentDetails();

        System.out.println();

        p = new NetBankingPayment();
        p.makePayment(2500);
        p.generateReceipt();
        p.displayPaymentDetails();
    }
}
