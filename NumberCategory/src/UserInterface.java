import java.util.Scanner;
public class UserInterface{
	
	public static NumberCategory checkAmicable() {
		 return (number1, number2) -> (sumOfDivisors(number1) == number2 && sumOfDivisors(number2) == number1);
	}
	
	private static int sumOfDivisors(int num) {
		 int sum = 1;
		 for(int i = 2; i <= Math.sqrt(num); i++) {
			 if(num % i == 0) {
				 sum += i;
				 if(i != num / i) {
					 sum += num / i;
				 }
			 }
		 }
		 return sum;
   }
			 
   public static NumberCategory checkPalindrome() {
	      return (int number1, int number2) -> {
	                int product = number1 * number2;
	                return isPalindrome(product);
	       };
   }
   
   private static boolean isPalindrome(int num) {
		 int original = num, reversed = 0;
		 while(num > 0) {
			 int rem = num % 10;
			 reversed = reversed * 10 + rem;
			 num /= 10;
		 }
		 
		 return original == reversed;
  }
			 

	 
	public static void main(String [] args){

	    Scanner sc = new Scanner(System.in);
	    int number1 = sc.nextInt();
	    int number2 = sc.nextInt();
	    
	    NumberCategory amicableChecker = checkAmicable();
        NumberCategory palindromeChecker = checkPalindrome();
        
        if (amicableChecker.checkNumberCategory(number1, number2)) {
            System.out.println(number1 + " and " + number2 + " are amicable numbers");
        } else {
            System.out.println(number1 + " and " + number2 + " are not amicable numbers");
        }

        if (palindromeChecker.checkNumberCategory(number1, number2)) {
            System.out.println("Their Product " + (number1 * number2) + " do produces a Palindrome");
        } else {
            System.out.println("Their Product " + (number1 * number2) + " does not produce a Palindrome");
        }
	    
	  }
}