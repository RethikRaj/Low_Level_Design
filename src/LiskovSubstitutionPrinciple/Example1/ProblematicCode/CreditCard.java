package LiskovSubstitutionPrinciple.Example1.ProblematicCode;

public abstract class CreditCard {
    String creditCardNumber;
    String ownerName;
    String cvv;
    // getters and setters

    abstract void tapAndPay();
    abstract void swipeAndPay();
    abstract void upiPayment();
    abstract void internationalPayment();

}
