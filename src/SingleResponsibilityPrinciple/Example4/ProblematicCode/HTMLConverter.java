package SingleResponsibilityPrinciple.Example4.ProblematicCode;

// HTMLConverter responsibility is to convert any type of data to HTML

// But here , reading from file and writing to file is present inside the HTML converter class => Violates SRP
// Problems :
// 1. Writing mechanism changes => need to change this file when it has no relation to writing to file
// 2. Reading mechanism changes => need to change this file when it has no relation to writing to file

public class HTMLConverter {
    public void convertTextToHTML() {
        // 1. Read from text file
        readFile("./sample.txt");
        // 2. Convert to HTML
        System.out.println("Converting text to HTML");
        // 3. Write to HTML file
        writeToFile("./sample.HTML");
    }

    public void readFile(String path) {
        System.out.println("Reading file : " + path);
    }

    public void writeToFile(String path) {
        System.out.println("Writing to file : " + path);
    }

}
