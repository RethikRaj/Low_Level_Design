package DependencyInversionPrinciple.Example1.BetterCode;

public interface EmailClient {
    void sendEmail(String toAddress, String subject, String body);
}
