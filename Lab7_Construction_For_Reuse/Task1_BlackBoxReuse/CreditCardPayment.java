public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;
    private final double limit;

    public CreditCardPayment(String cardNumber, double limit) {
        this.cardNumber = cardNumber;
        this.limit = limit;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0 || amount > limit) {
            System.out.println("[CreditCard] Payment of Rs. " + amount + " DECLINED (limit: Rs. " + limit + ")");
            return false;
        }
        String masked = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("[CreditCard] Paid Rs. " + amount + " using card " + masked);
        return true;
    }
}
