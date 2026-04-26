package DependencyInversionPrinciple.Example1.BetterCode;

public class Main {
    public static void main(String[] args) {
        EmailService gmailService = new EmailService(new GmailClient());
        gmailService.sendWelcomeEmail("rethik@gmail.com", "rethik");

        EmailService outLookService = new EmailService(new OutLookClient());
        outLookService.sendPasswordResetEmail("rethik@gmail.com");
    }
}
