
public class App {
    public static void main(String[] args) {
    	Calculator cal = (a, b) -> System.out.println("Addition is: " + (a+b));
    	cal.calculate(5, 5);
    }
}
