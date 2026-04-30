package CreationalDesignPattern.Prototype.BetterCode;

public class Email implements Prototype<Email> {
    private String sender;
    private String receiver;
    private String subject;
    private String body;

    public Email(String sender, String receiver, String subject, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    // Copy constructor
    protected Email(Email source) {
        this(source.sender, source.receiver, source.subject, source.body);
    }

    @Override
    public Email copy() {
        return new Email(this);
    }

    // getters and setters
}
