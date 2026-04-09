package OpenClosedPrinciple.Example1.ProblematicCode;

public class PaymentProcessor {
    public void processCreditCardPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Complex logic for credit card processing
    }

    public void processPayPalPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Logic for PayPal processing
    }

    // Further if we  need to GpayPayment, BitcoinPayment => I need to modify this class => Violates OCP

}
