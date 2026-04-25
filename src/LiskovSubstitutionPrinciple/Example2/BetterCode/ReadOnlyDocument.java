package LiskovSubstitutionPrinciple.Example2.BetterCode;

public class ReadOnlyDocument implements Document {
    private final String data;

    ReadOnlyDocument(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return this.data;
    }
}
