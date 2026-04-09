package OpenClosedPrinciple.Example1.BetterCode;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // Logic to process PayPal payment
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
