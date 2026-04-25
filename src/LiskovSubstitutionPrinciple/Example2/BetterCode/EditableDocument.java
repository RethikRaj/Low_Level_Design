package LiskovSubstitutionPrinciple.Example2.BetterCode;

public class EditableDocument implements Editable{
    private String data;

    public EditableDocument(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void save(String newData) {
        this.data = newData;
        System.out.println("Document saved.");
    }
}
