// Generic class with a type parameter T
class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void displayType() {
        System.out.println("Type of T: " + item.getClass().getName());
    }
}
