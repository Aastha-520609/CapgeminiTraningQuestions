import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        FruitBasketUtility utility = new FruitBasketUtility();
        
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add Fruit to Basket");
            System.out.println("2. Calculate Bill");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.println("Enter the fruit name");
                String name = scanner.nextLine();
                
                System.out.println("Enter weight in Kgs");
                int weight = scanner.nextInt();
                
                System.out.println("Enter price per Kg");
                int price = scanner.nextInt();
                
                utility.addToBasket(new FruitBasket(name, weight, price));
            } else if (choice == 2) {
                if (utility.getFruitBasketList().isEmpty()) {
                    System.out.println("Your basket is empty. Please add fruits.");
                } else {
                    int totalBill = utility.calculateBill(utility.getFruitBasketList().stream());
                    System.out.println("The estimated bill amount is Rs " + totalBill);
                }
            } else if (choice == 3) {
                System.out.println("Thank you for using the application.");
                return;
            }
        }
	}

}
