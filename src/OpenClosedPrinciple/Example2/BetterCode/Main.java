package OpenClosedPrinciple.Example2.BetterCode;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        List<NotificationChannel> notificationChannels = new ArrayList<>();
        notificationChannels.add(new EmailChannel());
        notificationChannels.add(new SMSChannel());

        service.sendNotification(notificationChannels, "Your order has shipped better");
    }
}
