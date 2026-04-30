package CreationalDesignPattern.Prototype.ImprovedCode;

public class Main {
    public static void main(String[] args) {
        // ── Polymorphic usage ──────────────────────────────────
        // The real power — caller works with base type, gets correct copy back/
        // I used Math.random() to simulate a runtime decision where the exact
        // concrete type (Email or PromotionalEmail) is not known at compile time.(Example : User i/p)

        Email unknown = Math.random() > 0.5
                ? new Email("system@company.com", "user@domain.com", "Welcome",
                "Thanks for signing up!")
                :
                new PromotionalEmail("offers@shop.com", "user@domain.com", "Big Sale!",
                "Get 50% off on all items", "SAVE50"
        );

        Email unknownCopy = unknown.copy();  // ✅ correct copy() called via polymorphism

        // To access the subclass fields - we need to do checking + casting - but this is expected(normal) and it is the caller's responsibility
        // Before(in problematic code) we were checking run time type just for copying which is bad


        // Way 1 :
        if(unknownCopy instanceof PromotionalEmail) {
            System.out.println(((PromotionalEmail) unknownCopy).getDiscountCode());
        }

        // Way 2 : (Java 16+)
//        if(unknownCopy instanceof PromotionalEmail pe) {
//            System.out.println(pe.getDiscountCode());
//        }
    }
}