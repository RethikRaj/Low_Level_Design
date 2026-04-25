package LiskovSubstitutionPrinciple.Example2.ProblematicCode;

import java.util.List;

public class DocumentProcessor {
    public void processDocuments(List<Document> documents) {
        // Problematic : Throws error. Because Document has promised that every subtype of Document will support
        // save behavior(method) but read only document doesn't support it
//        for(Document doc : documents) {
//            doc.open();
//            // Edit
//            String newData = "newData";
//            doc.save(newData);
//        }

        // Above code throws error
        // So we try to fix
        // Worst fix
        for(Document doc : documents) {
            doc.open();
            if (doc instanceof  ReadOnlyDocument) {
                System.out.println("Can't write data");
            }else {
                String newData = "newData";
                doc.save(newData);
            }
        }

        // The document processor class now has to know about the specific types of documents and their behaviors(methods),
        // Therefore polymorphism is broken and the code is not extensible.
        // If we want to add a new type of document, we will have to modify the document processor class,
        // which violates the Open/Closed Principle.
    }
}
