package SingleResponsibilityPrinciple.Example5;

import SingleResponsibilityPrinciple.Example3.BetterCode.Employee;

// This code is SRP compliant because the responsibility of  GenerateEmployeePerformanceReport is to generate report, which is the only thing it does
// It violates OCP.

public class GenerateEmployeePerformanceReport {
    public String generateReport(String reportType, Employee employee) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}
