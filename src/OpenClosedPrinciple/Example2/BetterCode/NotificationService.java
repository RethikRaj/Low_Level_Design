package OpenClosedPrinciple.Example2.BetterCode;

import java.util.List;

public class NotificationService {
    public void sendNotification(List<NotificationChannel> channels, String message) {
//        for(NotificationChannel channel : channels) {
//            channel.sendNotification(message);
//        }

//        channels.stream()
//                .forEach(channel -> channel.sendNotification(message));

        channels.forEach(channel -> channel.sendNotification(message));
    }
}
