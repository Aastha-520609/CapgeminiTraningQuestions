import java.util.*;
public class ElementsDivisibleBy7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] firstArray = new int[size];
		
		int count = 0;
		for(int i=0; i<size; i++) {
			firstArray[i] = sc.nextInt();
			if(firstArray[i] % 7 == 0) {
				count++;
			}
		}
		
		int[] secondArray = new int[count];
		int index = 0;
		
		for(int i=0; i<size; i++) {
			if(firstArray[i] % 7 == 0) {
				secondArray[index++] = firstArray[i];
			}
		}
		
		for(int i=0; i<secondArray.length; i++) {
			System.out.println(secondArray[i]);
		}
	}
}
