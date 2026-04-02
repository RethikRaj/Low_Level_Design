package SingleResponsibilityPrinciple.Example4.BetterCode;

public class FileProcessor {
    public void readFile(String path) {
        System.out.println("Reading file : " + path);
    }

    public void writeToFile(String path) {
        System.out.println("Writing to file : " + path);
    }
}
