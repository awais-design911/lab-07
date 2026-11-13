/** Abstraction that the cart depends on (black-box reuse). */
public interface PaymentMethod {
    boolean pay(double amount);
}
