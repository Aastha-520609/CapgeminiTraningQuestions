import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Country country = new Country();
		
		while(true) {
			System.out.println("1.Add");
			System.out.println("2.Search");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter the country name");
				String name = sc.nextLine();
				System.out.println("Enter the capital name");
				String capital = sc.nextLine();
				country.add(name, capital);
			}
			else if(choice == 2) {
				if (country.getCountryMap().isEmpty()) {
                    System.out.println("The map is empty");
                } else {
                    System.out.println("Enter the country name");
                    String searchCountry = sc.nextLine();
                    System.out.println(country.search(searchCountry));
                }
			}else if(choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}
		}
	}
}
