package OpenClosedPrinciple.Example1.BetterCode;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment of $" + amount);
    }
}
