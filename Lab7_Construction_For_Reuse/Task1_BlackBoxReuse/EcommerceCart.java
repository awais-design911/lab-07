import java.util.ArrayList;
import java.util.List;

/**
 * The cart is composed with a PaymentMethod via constructor injection.
 * It never knows (or cares) which concrete payment type it is using.
 */
public class EcommerceCart {
    private final PaymentMethod paymentMethod;
    private final List<String> items = new ArrayList<>();
    private double total = 0;

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addItem(String name, double price) {
        items.add(name);
        total += price;
        System.out.println("Added: " + name + " (Rs. " + price + ")");
    }

    public boolean checkout() {
        System.out.println("Checkout -> Items: " + items + " | Total: Rs. " + total);
        return paymentMethod.pay(total);
    }
}
