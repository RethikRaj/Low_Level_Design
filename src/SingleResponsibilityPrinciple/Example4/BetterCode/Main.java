package SingleResponsibilityPrinciple.Example4.BetterCode;

public class Main {
    public static void main(String[] args) {
        FileProcessor fp = new FileProcessor();

        HTMLConverter hc = new HTMLConverter(fp);

        hc.convertTextToHTML();
    }
}
