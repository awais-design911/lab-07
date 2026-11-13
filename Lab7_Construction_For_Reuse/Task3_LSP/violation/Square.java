public class Square extends Rectangle {
    // LSP VIOLATION: strengthens the precondition (w must equal h).
    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException("Square requires w == h, got w=" + w + ", h=" + h);
        }
        super.setDimensions(w, h);
    }
}
