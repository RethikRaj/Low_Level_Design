package DependencyInversionPrinciple.Example1.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();

        emailService.sendWelcomeEmail("rethik@gmail.com", "rethik");
    }
}
