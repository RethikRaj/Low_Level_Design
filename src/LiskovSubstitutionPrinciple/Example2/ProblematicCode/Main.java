package LiskovSubstitutionPrinciple.Example2.ProblematicCode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor documentProcessor = new DocumentProcessor();


        documentProcessor.processDocuments(
                List.of(
                        new Document("old data 1"),
                        new ReadOnlyDocument("Old data 2")
                )
        );
    }
}
