package LiskovSubstitutionPrinciple.Example1.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        CreditCard visaCard = new VisaCreditCard();
        CreditCard masterCard = new MasterCreditCard();

        System.out.println("Processing Visa card payment:");
        paymentProcessor.processPayment(visaCard);

        System.out.println("\nProcessing Master card payment:");
        paymentProcessor.processPayment(masterCard);
    }
}
