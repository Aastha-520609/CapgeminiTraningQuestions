public class GenericExample {
	public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        System.out.println("Integer Value: " + intBox.getItem());
        intBox.displayType();

        Box<String> strBox = new Box<>("Hello");
        System.out.println("String Value: " + strBox.getItem());
        strBox.displayType();
    }
}
