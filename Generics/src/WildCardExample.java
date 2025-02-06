import java.util.List;
import java.util.Arrays;

class WildCardExample {
    // Method that accepts a list of any subclass of Number
    public static double sumOfNumbers(List<?> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        System.out.println("Sum of integers: " + sumOfNumbers(intList));
        System.out.println("Sum of doubles: " + sumOfNumbers(doubleList));
    }
}
