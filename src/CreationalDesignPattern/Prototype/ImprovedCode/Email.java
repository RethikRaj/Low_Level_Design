package CreationalDesignPattern.Prototype.ImprovedCode;

public class Email implements Prototype<Email>{
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
    // Why protected ?
    // Think about who can call new Email(someEmail) ?
    // public Email(Email source)    // ❌ Everyone — leaks internal copying mechanism
    // private Email(Email source)   // ❌ Only Email — PromotionalEmail can't call super(source)
    // protected Email(Email source) // ✅ Only Email + its subclasses — exactly who needs it

    protected Email(Email source) {
        this(source.sender, source.receiver, source.subject, source.body);
    }

    @Override
    public Email copy() {
        return new Email(this);
    }

    // getters and setters
}
