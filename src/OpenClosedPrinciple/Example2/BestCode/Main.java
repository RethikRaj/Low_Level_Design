package OpenClosedPrinciple.Example2.BestCode;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.sendNotification(
                List.of(NotificationChannelType.EMAIL, NotificationChannelType.SMS),
                "Your order has shipped"
        );
    }
}

