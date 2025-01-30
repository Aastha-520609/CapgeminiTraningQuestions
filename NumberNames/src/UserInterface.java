import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the number");
		String number = sc.nextLine();
		
		String[] numbersName = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<number.length(); i++) {
			char digit = number.charAt(i);
			if(Character.isDigit(digit)) {
				result.append(numbersName[digit - '0']).append(" ");
			}
			else {
				System.out.println("Invalid input. Please enter only digits.");
                return;
			}
		}
		
		System.out.println(result.toString().trim());	
	}

}
