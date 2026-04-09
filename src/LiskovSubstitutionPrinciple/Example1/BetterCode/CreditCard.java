package LiskovSubstitutionPrinciple.Example1.BetterCode;

public abstract class CreditCard {
    String creditCardNumber;
    String ownerName;
    String cvv;
    // getters and setters

    // Only the methods EVERY card supports go here
    abstract void tapAndPay();
    abstract void swipeAndPay();

}
