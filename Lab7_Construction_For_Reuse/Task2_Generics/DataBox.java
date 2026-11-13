/** Reusable, type-safe container. */
public class DataBox<T> {
    private final T value;

    public DataBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
