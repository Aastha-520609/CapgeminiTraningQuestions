import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the day");
		int day = sc.nextInt();
		if(day <= 0 || day > 30) {
			System.out.println(day + " is invalid day");
		}
		else {
			int calculateEggCount = pellSeries(day);
			System.out.println("Number of eggs in " + day + "th day is " + calculateEggCount);
		}
	}
	
	public static int pellSeries(int n) {
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			return 2;
		}
		
		int first = 1;
		int second = 2;
		int pell = 0;
		
		for(int i = 3; i <= n; i++) {
			pell = 2 * second + first;
			first = second;
			second = pell;
		}
		
		return pell;
	}

}
