package OpenClosedPrinciple.Example2.BestCode;

import java.util.List;

public class NotificationService {
    public void sendNotification(List<NotificationChannelType> channelTypes, String message) {
        channelTypes.stream()
                .map(NotificationChannelType::createChannel)
                .forEach((channel -> channel.sendNotification(message)));
    }
}
