package DependencyInversionPrinciple.Example1.BetterCode;

public class OutLookClient implements EmailClient{

    @Override
    public void sendEmail(String toAddress, String subject, String body) {
        System.out.println("Connecting to Outlook Exchange server...");
        System.out.println("Sending email via Outlook to: " + toAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        // ... actual Outlook API interaction logic ...
        System.out.println("Outlook email sent successfully!");
    }
}
