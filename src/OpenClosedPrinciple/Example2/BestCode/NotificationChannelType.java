package OpenClosedPrinciple.Example2.BestCode;

public enum NotificationChannelType {
    EMAIL {
        @Override
        public NotificationChannel createChannel() { return new EmailChannel();}
    },
    SMS {
        @Override
        public NotificationChannel createChannel() { return new SMSChannel();}
    };

    public abstract NotificationChannel createChannel();
}
