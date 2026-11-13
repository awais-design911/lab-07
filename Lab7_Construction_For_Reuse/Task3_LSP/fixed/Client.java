import java.util.List;

public class Client {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(1, 1);
        rect.setDimensions(5, 10);          // w=5, h=10 now safe on Rectangle

        Square square = new Square(4);      // Square has its own contract (one side)

        List<Shape> shapes = List.of(rect, square);
        for (Shape s : shapes) {
            System.out.println(s.getName() + " -> Area = " + s.getArea());
        }
        System.out.println("No crash: Square and Rectangle are no longer in an inheritance chain.");
    }
}
