package LiskovSubstitutionPrinciple.Example1.BetterCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        VisaCreditCard visaCard = new VisaCreditCard();
        MasterCreditCard masterCard = new MasterCreditCard();
        RupayCreditCard rupayCard = new RupayCreditCard();

        System.out.println("Processing Visa card payment:");
        paymentProcessor.processBasicPayment(visaCard);

//        paymentProcessor.processUpiPayment(visaCard); // compile time error

        System.out.println("\nProcessing Master card payment:");
        paymentProcessor.processInternationalPayment(masterCard);

        System.out.println("\nProcessing Rupay card payment:");
//        paymentProcessor.processInternationalPayment(rupayCard); // compile time error
        paymentProcessor.processUpiPayment(rupayCard);
    }
}
