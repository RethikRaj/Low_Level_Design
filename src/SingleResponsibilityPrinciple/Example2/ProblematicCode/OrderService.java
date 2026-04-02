package SingleResponsibilityPrinciple.Example2.ProblematicCode;

// Responsibility of Order Service is to createOrder, deleteOrder, getOrder, updateOrder (ORDER LIFECYCLE)

// But in this code we have payment logic , invoice generation logic , notification logic => Not SRP compliant

// Problem :
// 1. If payment logic changes => this file is needed to be modified. When originally it is not meant for payment logic at all.
// 2. Similarly for invoice generation logic , notification logic

public class OrderService {
    public void createOrder(String item, int quantity) {
        System.out.println("Order created for item: " + item + " with quantity: " + quantity);
    }

    public void deleteOrder(int id) {
        System.out.println("Order deleted id : " + id);
    }

    // VIOLATION 1: Handles payment logic
    public void processPayment(String paymentType) {
        System.out.println("Processing payment via: " + paymentType);
    }

    // VIOLATION 2: Handles invoice generation
    public void generateInvoice() {
        System.out.println("Invoice generated successfully.");
    }

    // VIOLATION 3: Handles notification logic
    public void sendEmailNotification(String email) {
        System.out.println("Email sent to customer: " + email);
    }
}
