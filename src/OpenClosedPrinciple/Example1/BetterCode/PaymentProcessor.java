package OpenClosedPrinciple.Example1.BetterCode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        // validateAmount(amount);        // guard checks
        // logTransaction(amount);        // audit trail
        paymentMethod.processPayment(amount); // actual payment
        // sendConfirmationEmail();       // post-processing
        // updateInventory();
    }
}
