package OpenClosedPrinciple.Example1.BetterCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        CheckoutService checkoutService = new CheckoutService(paymentProcessor);

        checkoutService.checkout(10.24, new CreditCardPayment());
        checkoutService.checkout(100.00, new PayPalPayment());
    }
}
