package CreationalDesignPattern.Prototype.BetterCode;

public class Main {
    public static void main(String[] args) {
        PrototypeRegistry<Email> emailPrototypes = new PrototypeRegistry<>();

        // Register Email prototypes
        emailPrototypes.register("basic-email",
                new Email("noreply@x.com", "user@x.com",
                        "Welcome!", "Thanks for signing up."));

        emailPrototypes.register("promo-email",
                new PromotionalEmail("shop@x.com", "customer@x.com",
                        "Big Sale!", "Check our deals!", "SAVE20"));

        // Get clone if needed
        Email e1 = emailPrototypes.get("basic-email");
        Email e2 = emailPrototypes.get("promo-email");

        // Make tweaks if needed
        if(e2 instanceof PromotionalEmail pe2) {
            pe2.setDiscountCode("SAVE50");
        }
    }
}