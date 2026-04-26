package DependencyInversionPrinciple.Example1.ProblematicCode;

public class EmailService {
    private GmailClient gmailClient; // tightly coupled to GmailClient

    public EmailService() {
        this.gmailClient = new GmailClient();
    }

    public void sendWelcomeEmail(String userEmail, String userName) {
        String subject = "Welcome, " + userName + "!";
        String body = "Thanks for signing up to our awesome platform. We're glad to have you!";
        this.gmailClient.sendGmail(userEmail, subject, body);
    }

    public void sendPasswordResetEmail(String userEmail) {
        String subject = "Reset Your Password";
        String body = "Please click the link below to reset your password...";
        this.gmailClient.sendGmail(userEmail, subject, body);
    }
}
