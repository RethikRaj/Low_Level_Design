package OpenClosedPrinciple.Example2.BetterCode;

public class SMSChannel implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
        // SMS-specific logic (Twilio, carrier API, etc.)
    }
}
