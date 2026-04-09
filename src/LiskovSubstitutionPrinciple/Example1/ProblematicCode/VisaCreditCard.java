package LiskovSubstitutionPrinciple.Example1.ProblematicCode;

public class VisaCreditCard extends CreditCard {
    @Override
    void tapAndPay() {
        System.out.println("Visa card tap and pay");
    }

    @Override
    void swipeAndPay() {
        System.out.println("Visa card swipe and pay");
    }

    @Override
    void upiPayment() {
        throw new UnsupportedOperationException("Visa card does not support UPI payment");
    }

    @Override
    void internationalPayment() {
        System.out.println("Visa card international payment");
    }
}
