package LiskovSubstitutionPrinciple.Example2.ProblematicCode;

public class ReadOnlyDocument extends Document {
    public ReadOnlyDocument(String data) {
        super(data);
    }

    @Override
    public void save(String newData) {
        throw new UnsupportedOperationException("Cannot save a read-only document!");
        // Problem : Overriding a method just to throw an exception
    }
}
