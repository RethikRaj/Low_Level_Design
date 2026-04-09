package LiskovSubstitutionPrinciple.Example1.ProblematicCode;

public class MasterCreditCard extends CreditCard{
    @Override
    void tapAndPay() {
        System.out.println("Master card tap and pay");
    }

    @Override
    void swipeAndPay() {
        System.out.println("Master card swipe and pay");
    }

    @Override
    void upiPayment() {
        throw new UnsupportedOperationException("Master card does not support UPI payment");
    }

    @Override
    void internationalPayment() {
        System.out.println("Master card international payment");
    }
}
