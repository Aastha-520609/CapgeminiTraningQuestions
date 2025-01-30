import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the number");
		int number = sc.nextInt();

		if(number >= 1000 && number <= 9999) {
			int reversed = 0, temp = number;
			while(temp > 0) {
				int digit = temp % 10;
				reversed = reversed * 10 + digit;
				temp /= 10;
			}
			
			System.out.println("Reversed number is "+ reversed);
			
			//converting to string
			String reversedStr = String.valueOf(reversed);
			StringBuilder expanded = new StringBuilder();
			for(int i=0; i<reversedStr.length(); i++) {
				if(expanded.length() > 0) {
					expanded.append("+");
				}
				expanded.append(reversedStr.charAt(i));
				for(int j=i+1; j<reversedStr.length(); j++) {
					expanded.append("0");
				}
			}
			
			System.out.println(expanded);
		}
		else {
			System.out.println(number + " is an invalid number");
		}
		
	}

}
