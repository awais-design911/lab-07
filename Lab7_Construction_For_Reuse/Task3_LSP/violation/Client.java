public class Client {
    // Client written against the Rectangle contract only.
    static void resize(Rectangle r) {
        r.setDimensions(5, 10);
        System.out.println("Area = " + r.getArea());
    }

    public static void main(String[] args) {
        System.out.println("--- Using a real Rectangle ---");
        resize(new Rectangle());          // works: Area = 50

        System.out.println("--- Substituting a Square for a Rectangle ---");
        try {
            resize(new Square());         // CRASH: precondition strengthened
        } catch (IllegalArgumentException e) {
            System.out.println("SYSTEM CRASH: " + e.getMessage());
            System.out.println("Liskov Substitution Principle VIOLATED.");
        }

        System.out.println("--- Uncaught crash (real behaviour) ---");
        resize(new Square());             // throws and terminates the program
    }
}
