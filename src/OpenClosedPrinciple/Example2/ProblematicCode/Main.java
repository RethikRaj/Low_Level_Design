package OpenClosedPrinciple.Example2.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        List<String> notifications = new ArrayList<>();
        notifications.add("Email");
        notifications.add("SMS");

        service.sendNotification(notifications, "Your order has shipped!");
    }
}
