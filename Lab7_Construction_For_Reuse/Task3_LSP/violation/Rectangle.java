public class Rectangle {
    protected int width;
    protected int height;

    // Contract: ANY positive width and height are accepted.
    public void setDimensions(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int getArea() {
        return width * height;
    }
}
