public class BoundedGenerics {
	 public static void main(String[] args) {
	        Calculator<Integer> intCalc = new Calculator<>(10, 20);
	        System.out.println("Sum: " + intCalc.add());

	        Calculator<Double> doubleCalc = new Calculator<>(5.5, 2.5);
	        System.out.println("Sum: " + doubleCalc.add());

	        // Calculator<String> strCalc = new Calculator<>("A", "B");
	    }
}
