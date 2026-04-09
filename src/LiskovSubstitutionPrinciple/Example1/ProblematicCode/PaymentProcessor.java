package LiskovSubstitutionPrinciple.Example1.ProblematicCode;

public class PaymentProcessor {
    public void processPayment(CreditCard creditCard) {
//        creditCard.tapAndPay();
//        creditCard.swipeAndPay();
//        creditCard.upiPayment(); // visa and master cards do not support UPI payment, this will throw a run time exception
//        creditCard.internationalPayment(); // rupay card does not support international payment, this will throw a run time exception


        // Worst Fix :
        creditCard.tapAndPay();
        creditCard.swipeAndPay();

        if(creditCard instanceof VisaCreditCard || creditCard instanceof MasterCreditCard) {
            creditCard.internationalPayment();
        }
        else if(creditCard instanceof RupayCreditCard) {
            creditCard.upiPayment();
        }

        // The payment processor class now has to know about the specific types of credit cards and their capabilities,
        // Therefore polymorphism is broken and the code is not extensible.
        // If we want to add a new type of credit card, we will have to modify the payment processor class, which violates the Open/Closed Principle.
    }
}
