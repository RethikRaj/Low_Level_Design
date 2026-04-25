package LiskovSubstitutionPrinciple.Example2.ProblematicCode;

public class Document {
    private String name;
    private String data;

    public Document(String data) {
        this.data = data;
    }

    public void open() {
        System.out.println("Document opened. Data: " + data.substring(0, Math.min(data.length(), 20)) + "...");
    }

    public void save(String newData) {
        this.data = newData;
        System.out.println("Document saved.");
    }

    public String getData() {
        return data;
    }
}
