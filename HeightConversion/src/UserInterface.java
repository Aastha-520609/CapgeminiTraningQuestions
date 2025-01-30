import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter height in cm");
		double height = sc.nextDouble();
		double feet = 30.48;
		double heightInFeet = height / feet;
		System.out.printf("Height in feet is %.2f feet", heightInFeet);
		
	}

}
