public class Main {
    public static void main(String[] args) {
        System.out.println("=== Cart 1: Credit Card ===");
        EcommerceCart cart1 = new EcommerceCart(new CreditCardPayment("1234567812345678", 50000));
        cart1.addItem("Laptop Bag", 3500);
        cart1.addItem("Wireless Mouse", 1500);
        System.out.println("Result: " + (cart1.checkout() ? "SUCCESS" : "FAILED"));

        System.out.println("\n=== Cart 2: JazzCash ===");
        EcommerceCart cart2 = new EcommerceCart(new JazzCashPayment("0300-1234567", 10000));
        cart2.addItem("Keyboard", 4000);
        cart2.addItem("USB Hub", 1200);
        System.out.println("Result: " + (cart2.checkout() ? "SUCCESS" : "FAILED"));

        System.out.println("\n=== Cart 3: JazzCash (insufficient balance) ===");
        EcommerceCart cart3 = new EcommerceCart(new JazzCashPayment("0311-7654321", 500));
        cart3.addItem("Headphones", 2500);
        System.out.println("Result: " + (cart3.checkout() ? "SUCCESS" : "FAILED"));

        System.out.println("\n=== Dynamic payment type via interface reference ===");
        PaymentMethod[] methods = { new CreditCardPayment("9999888877776666", 20000), new JazzCashPayment("0345-1112223", 20000) };
        for (PaymentMethod m : methods) {
            EcommerceCart c = new EcommerceCart(m);
            c.addItem("Phone Case", 800);
            c.checkout();
        }
    }
}
