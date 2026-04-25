package LiskovSubstitutionPrinciple.Example2.BetterCode;

public interface Editable extends  Document {
    void save(String newData);
}
