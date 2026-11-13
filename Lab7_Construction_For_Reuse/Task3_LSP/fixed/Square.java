public class Square implements Shape {
    private int side;

    public Square(int side) {
        setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() { return side * side; }

    @Override
    public String getName() { return "Square(" + side + ")"; }
}
