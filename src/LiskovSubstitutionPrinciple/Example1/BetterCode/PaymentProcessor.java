package LiskovSubstitutionPrinciple.Example1.BetterCode;

public class PaymentProcessor {
    public void processBasicPayment(CreditCard card) {
        card.tapAndPay();
        card.swipeAndPay();
    }

    public void processUpiPayment(UpiPayable card) {
        card.upiPayment();
    }

    public void processInternationalPayment(InternationalPayable card) {
        card.internationalPayment();
    }
}
