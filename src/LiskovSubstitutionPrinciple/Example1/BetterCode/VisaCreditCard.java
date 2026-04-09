package LiskovSubstitutionPrinciple.Example1.BetterCode;


public class VisaCreditCard extends CreditCard implements InternationalPayable{
    @Override
    void tapAndPay() {
        System.out.println("Visa card tap and pay");
    }

    @Override
    void swipeAndPay() {
        System.out.println("Visa card swipe and pay");
    }


    @Override
    public void internationalPayment() {
        System.out.println("Visa card internal payment");
    }
}
