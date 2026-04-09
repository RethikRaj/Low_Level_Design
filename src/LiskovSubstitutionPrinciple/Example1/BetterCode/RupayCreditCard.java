package LiskovSubstitutionPrinciple.Example1.BetterCode;


public class RupayCreditCard extends CreditCard implements UpiPayable{
    @Override
    void tapAndPay() {
        System.out.println("Rupay card tap and pay");
    }

    @Override
    void swipeAndPay() {
        System.out.println("Rupay card swipe and pay");
    }

    @Override
    public void upiPayment() {
        System.out.println("Rupay card upi payment");
    }
}
