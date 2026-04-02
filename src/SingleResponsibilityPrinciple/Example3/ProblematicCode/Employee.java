package SingleResponsibilityPrinciple.Example3.ProblematicCode;

// Responsibility of Employee clas must be to define the fields (structure) and define it getters and setters.

// But here it does generatePerformanceReport, salary computation, fetch employeeBiodata.

public class Employee {
    private int id; // Employee ID
    private String name; // Employee Name

    // constructors , getters, setter

    public void generatePerformanceReport(String type) {
        // Code to print performance report
        System.out.println("Performance report of type : " + type + " is generated for employee: " + name);
    }

    public double computeSalary() {
        // Code to compute salary
        return 1000.0;
    }

    public void fetchEmployeeBioData() {
        // Code to fetch employee data
        System.out.println("Employee Bio data fetched successfully");
    }
}
