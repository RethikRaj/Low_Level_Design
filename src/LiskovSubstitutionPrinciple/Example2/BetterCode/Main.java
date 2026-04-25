package LiskovSubstitutionPrinciple.Example2.BetterCode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor documentProcessor = new DocumentProcessor();

        documentProcessor.processAndSaveDocuments(
                List.of(
                        new EditableDocument("old data1"),
                        new EditableDocument("old data 2")
                )
        );

        documentProcessor.processDocuments(
                List.of(
                        new ReadOnlyDocument("old data3"),
                        new ReadOnlyDocument("Old data 4")
                )
        );
    }
}
