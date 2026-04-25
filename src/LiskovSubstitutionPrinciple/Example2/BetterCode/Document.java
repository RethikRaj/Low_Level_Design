package LiskovSubstitutionPrinciple.Example2.BetterCode;

public interface Document {
    // common methods
    default void open() {
        System.out.println("Document opened. Data: " + this.getData() + "...");
    }

    String getData();
}
