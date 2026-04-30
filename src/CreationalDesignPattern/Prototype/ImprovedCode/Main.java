package CreationalDesignPattern.Prototype.ImprovedCode;

public class Main {
    public static void main(String[] args) {
        // ── Polymorphic usage ──────────────────────────────────
        // The real power — caller works with base type, gets correct copy back
        Email unknown = new PromotionalEmail(
                "shop@x.com", "customer@x.com",
                "Flash Sale!", "Limited time!", "FLASH50"
        );
        Email unknownCopy = unknown.copy();  // ✅ correct copy() called via polymorphism

        System.out.println("\n── Polymorphic copy ──");
        System.out.println("Original : " + unknown.getClass());
        System.out.println("Copy     : " + unknownCopy.getClass());
        System.out.println("Same ref?: " + (unknown == unknownCopy)); // false


        // ── Email ──────────────────────────────────────────────
        Email e1 = new Email("alice@x.com", "bob@x.com", "Hello", "How are you?");
        Email e2 = e1.copy();

        System.out.println("── Email ──");
        System.out.println("Original : " + e1);
        System.out.println("Copy     : " + e2);
        System.out.println("Same ref?: " + (e1 == e2));        // false — different objects


        // ── PromotionalEmail ───────────────────────────────────
        PromotionalEmail p1 = new PromotionalEmail(
                "shop@x.com", "customer@x.com",
                "Big Sale!", "Check our deals!", "SAVE20"
        );
        PromotionalEmail p2 = p1.copy();

        System.out.println("\n── PromotionalEmail ──");
        System.out.println("Original : " + p1);
        System.out.println("Copy     : " + p2);
        System.out.println("Same ref?: " + (p1 == p2));        // false — different objects
    }
}