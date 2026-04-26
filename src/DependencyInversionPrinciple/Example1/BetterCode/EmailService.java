package DependencyInversionPrinciple.Example1.BetterCode;

public class EmailService {
    private EmailClient emailClient;

    public EmailService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    public void sendWelcomeEmail(String userEmail, String userName) {
        String subject = "Welcome, " + userName + "!";
        String body = "Thanks for signing up to our awesome platform. We're glad to have you!";
        this.emailClient.sendEmail(userEmail, subject, body);
    }

    public void sendPasswordResetEmail(String userEmail) {
        String subject = "Reset Your Password";
        String body = "Please click the link below to reset your password...";
        this.emailClient.sendEmail(userEmail, subject, body);
    }
}
