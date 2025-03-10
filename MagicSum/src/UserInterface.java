import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array size");
       int size = sc.nextInt();
       if (size < 1 || size > 5) {
           System.out.println(size + " is an invalid array size");
           return;
       }
       
       System.out.println("Enter the numbers");
       int[] array = new int[size];
       for(int i=0; i<array.length; i++) 
       {
         array[i] = sc.nextInt();
         if (array[i] <= 0 || array[i] >= 100) {
           System.out.println(array[i] + " is an invalid input");
           return;
         }
       }
       
       boolean primeSum = false;
       
       for(int number: array) {
    	   if(isPrime(number) && (isSumOfPrimes(number))){
    		   if(!primeSum) {
    			   System.out.println("The sum of prime numbers is");
    		   }
    		   System.out.println(number);
			   primeSum = true;
    	   }
       }
       
       if(!primeSum) {
    	   System.out.println("The " + size + " numbers are not sum of prime numbers");
       }
        
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isSumOfPrimes(int number) {
    	int sum = 0;
    	int first = 2;
    	
    	while(sum < number) {
    		if(isPrime(first)) {
    			sum += first;
    		}
    		first++;
    	}
    	
    	return sum == number;
    }
}