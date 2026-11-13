public class JazzCashPayment implements PaymentMethod {
    private final String mobileNumber;
    private double balance;

    public JazzCashPayment(String mobileNumber, double balance) {
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("[JazzCash] Payment of Rs. " + amount + " FAILED (insufficient balance: Rs. " + balance + ")");
            return false;
        }
        balance -= amount;
        System.out.println("[JazzCash] Paid Rs. " + amount + " from account " + mobileNumber
                + " | Remaining balance: Rs. " + balance);
        return true;
    }
}
