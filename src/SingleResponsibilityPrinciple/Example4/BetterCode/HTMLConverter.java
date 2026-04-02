package SingleResponsibilityPrinciple.Example4.BetterCode;

public class HTMLConverter {
    FileProcessor fp;

    public HTMLConverter(FileProcessor fp) {
        this.fp = fp;
    }

    public void convertTextToHTML() {
        // 1. Read from text file
        fp.readFile("./sample.txt");

        // 2. Convert to HTML
        System.out.println("Converting text to HTML");

        // 3. Write to HTML file
        fp.writeToFile("./sample.HTML");
    }
}
