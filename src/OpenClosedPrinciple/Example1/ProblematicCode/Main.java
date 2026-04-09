package OpenClosedPrinciple.Example1.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        CheckoutService checkOutService = new CheckoutService(paymentProcessor);

        checkOutService.checkout(100.0, "creditCard");
        checkOutService.checkout(50.0, "paypal");
    }
}
