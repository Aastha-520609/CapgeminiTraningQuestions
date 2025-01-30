import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of PIN numbers");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(n + " is an invalid number");
            return;
        }

        System.out.println("Enter the PIN numbers");
        String[] pins = new String[n];
        int validPinCount = 0; 

        for (int i = 0; i < n; i++) {
            pins[i] = sc.next();

            if (pins[i].length() != 4) {
                System.out.println(pins[i] + " is an invalid PIN number");
                return;
            }

            if (isValidPin(pins[i])) {
                validPinCount++; 
            }
        }

        if (validPinCount == 0) {
            System.out.println("All these " + n + " numbers are not a valid PIN number");
        } else {
            System.out.println("Valid PIN numbers are");
            for (int i = 0; i < n; i++) {
                if (isValidPin(pins[i])) {
                    System.out.println(pins[i]);
                }
            }
        }
    }

    public static boolean isValidPin(String pin) {
        for (int i = 0; i < 4; i++) {
            char digitChar = pin.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if (i == 0 && digit % 2 == 0) { 
                return false;
            }
            if (i == 1 && digit % 2 != 0) { 
                return false;
            }
            if (i == 2 && !isPrime(digit)) { 
                return false;
            }
            if (i == 3 && isPrime(digit)) { 
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}