import java.util.Scanner;

public class UserInterface {
	public static void main(String [] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Model");
        String model = scanner.nextLine();
        
        System.out.println("Enter display (in inches)");
        double display = scanner.nextDouble();
        
        System.out.println("Enter Price");
        double price = scanner.nextDouble();
        
        IphoneSeries iphone = new IphoneSeries(model, display, price);
        iphone.displayDetails();
	}	

}