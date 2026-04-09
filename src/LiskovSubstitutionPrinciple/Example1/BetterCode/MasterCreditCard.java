package LiskovSubstitutionPrinciple.Example1.BetterCode;

public class MasterCreditCard extends CreditCard implements InternationalPayable{

    @Override
    void tapAndPay() {
        System.out.println("Master card tap and pay");
    }

    @Override
    void swipeAndPay() {
        System.out.println("Master card swipe and pay");
    }


    @Override
    public void internationalPayment() {
        System.out.println("Master card international payment");
    }
}
