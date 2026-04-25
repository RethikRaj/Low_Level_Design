package LiskovSubstitutionPrinciple.Example2.BetterCode;


import java.util.List;

public class DocumentProcessor {
    public void processDocuments(List<Document> documents) {
        for(Document d : documents) {
            d.open();
        }
    }

    public void processAndSaveDocuments(List<Editable> documents) {
        for(Editable d : documents) {
            d.open();
            d.save("new Data");
        }
    }
}
