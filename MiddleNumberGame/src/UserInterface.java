import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here 
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		if(size <= 0 || size > 10) {
			System.out.println("Please enter a valid number");
			return;
		}
		
		if(size % 2 == 0) {
			System.out.println("Please enter an odd number");
			return;
		}
		
		System.out.println("Enter the elements");
		int[] elements = new int[size];
		for(int i=0; i<elements.length; i++) {
			elements[i] = sc.nextInt();
			if(elements[i] <= 0 || elements[i] > 10) {
				System.out.println("Please enter valid elements in the array");
				return;
			}
		}
		
		if(size == 1) {
			System.out.println("The sum of the values is 0");
			System.out.println("The product of the values is 0");
		}
		
		int midIndex = size / 2;
        int midValue = elements[midIndex];

        int sum = 0;
        int product = 1;

        if (midValue % 2 == 0) { 
            for (int i = 0; i < midIndex; i++) {
                sum += elements[i];
            }
            
            for (int i = midIndex + 1; i < size; i++) {
                product *= elements[i];
            }
        } 
        else {
            for (int i = 0; i < midIndex; i++) {
                product *= elements[i];
            }
            
            for (int i = midIndex + 1; i < size; i++) {
                sum += elements[i];
            }
        }
		
		System.out.println("The sum of the values is " + sum);
		System.out.println("The product of the values is "+ product);
	}
}