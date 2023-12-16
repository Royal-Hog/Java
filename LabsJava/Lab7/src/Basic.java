public class Basic<T> {
    private T value;

    public Basic(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> void exchangeValues(Basic<T> obj1, Basic<T> obj2) {
        T temp = obj1.value;
        obj1.value = obj2.value;
        obj2.value = temp;
    }

}
