package OpenClosedPrinciple.Example2.BestCode;


public class EmailChannel implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending EMAIL: " + message);
        // Email-specific logic (SMTP, templates, etc.)
    }
}
