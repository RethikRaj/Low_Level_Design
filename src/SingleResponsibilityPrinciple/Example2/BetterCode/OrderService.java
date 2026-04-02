package SingleResponsibilityPrinciple.Example2.BetterCode;

public class OrderService {
    public void createOrder(String item, int quantity) {
        System.out.println("Order created for item: " + item + " with quantity: " + quantity);
    }

    public void deleteOrder(int id) {
        System.out.println("Order deleted id : " + id);
    }
}
