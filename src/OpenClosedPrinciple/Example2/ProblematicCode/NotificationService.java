package OpenClosedPrinciple.Example2.ProblematicCode;

import java.util.List;

public class NotificationService {
    public void sendNotification(List<String> channels, String message) {
        for(String channel : channels) {
            if ("Email".equals(channel)) {
                System.out.println("Sending EMAIL: " + message);
                // Email-specific logic (SMTP, templates, etc.)
            } else if ("SMS".equals(channel)) {
                System.out.println("Sending SMS: " + message);
                // SMS-specific logic (Twilio, carrier API, etc.)
            } else {
                throw new IllegalArgumentException("Unknown channel: " + channel);
            }
        }

        // Every time we want to add a new channel (Push, Slack, WhatsApp), the service must be modified.
    }
}
