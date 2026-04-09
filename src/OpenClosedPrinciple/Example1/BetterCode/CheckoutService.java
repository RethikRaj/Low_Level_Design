package OpenClosedPrinciple.Example1.BetterCode;

public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount, PaymentMethod paymentMethod) {
        paymentProcessor.processPayment(paymentMethod, amount);
    }
}
