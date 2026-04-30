package CreationalDesignPattern.Prototype.ImprovedCode;

public class PromotionalEmail extends Email {
    private String discountCode;

    public PromotionalEmail(String sender, String receiver, String subject, String body, String discountCode) {
        super(sender, receiver, subject, body);
        this.discountCode = discountCode;
    }

    // Copy constructor
    protected PromotionalEmail(PromotionalEmail source) {
        super(source);
        this.discountCode = source.discountCode;
    }

    @Override
    public PromotionalEmail copy() {
        return new PromotionalEmail(this);
    }

    // getters and setters
}
