package OpenClosedPrinciple.Example1.ProblematicCode;

public class CheckoutService {

    PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount, String paymentMethod) {
        if (paymentMethod.equalsIgnoreCase("creditCard")) {
            paymentProcessor.processCreditCardPayment(amount);
        } else if (paymentMethod.equalsIgnoreCase("paypal")) {
            paymentProcessor.processPayPalPayment(amount);
        } else {
            System.out.println("Unsupported payment method: " + paymentMethod);
        }

        // Further if we  need to GpayPayment, BitcoinPayment => We need to modify and add if-else => Violates OCP
    }

}
