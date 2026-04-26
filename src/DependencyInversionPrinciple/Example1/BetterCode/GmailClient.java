package DependencyInversionPrinciple.Example1.BetterCode;

public class GmailClient implements EmailClient{
    @Override
    public void sendEmail(String toAddress, String subject, String body) {
        System.out.println("Connecting to Gmail SMTP server...");
        System.out.println("Sending email via Gmail to: " + toAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        // ... actual Gmail API interaction logic ...
        System.out.println("Gmail email sent successfully!");
    }
}
