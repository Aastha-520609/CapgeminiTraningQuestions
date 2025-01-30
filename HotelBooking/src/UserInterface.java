import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the number of rooms you needed");
		int numberOfRooms = sc.nextInt();
		while (numberOfRooms <= 0) {
	            System.out.println("Please enter a valid number");
	            numberOfRooms = sc.nextInt();
	        }
		System.out.println("Enter the phone number");
		long number = sc.nextLong();
		
		int total = numberOfRooms * 500;
		
		System.out.println("Pay Rs. " + total + " for booking");
		System.out.println("Your booking has been confirmed");
	}
}