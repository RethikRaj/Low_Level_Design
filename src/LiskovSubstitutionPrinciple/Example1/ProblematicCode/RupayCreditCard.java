package LiskovSubstitutionPrinciple.Example1.ProblematicCode;

public class RupayCreditCard extends CreditCard{
    @Override
    void tapAndPay() {
        System.out.println("Rupay card tap and pay");
    }

    @Override
    void swipeAndPay() {
        System.out.println("Rupay card swipe and pay");
    }

    @Override
    void upiPayment() {
        System.out.println("Rupay card UPI payment");
    }

    @Override
    void internationalPayment() {
        throw new UnsupportedOperationException("Rupay card does not support international payment");
    }
}
