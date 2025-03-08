import java.util.List;
import java.util.Scanner;

public class UserInterface{
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		FruitBasketUtility basket = new FruitBasketUtility();
		
		while(true) {
			System.out.println("Select an option:");
			System.out.println("1.Add Fruit to Basket");
			System.out.println("2.Calculate Bill");
			System.out.println("3.Exit");
			
			int option = sc.nextInt();
			if(option == 1) {
				System.out.println("Enter the fruit name");
				String fruitName = sc.nextLine();
				
				System.out.println("Enter weight in Kgs");
				int weight = sc.nextInt();
				
				System.out.println("Enter price per Kg");
				int price = sc.nextInt();
				
				basket.addToBasket(new FruitBasket(fruitName, weight, price));
				
			}
			else if(option == 2) {
				List<FruitBasket> basketList = basket.getFruitBasketList();
				
				if(basketList.isEmpty()) {
					System.out.println("Your basket is empty. Please add fruits");
				}
				else {
					int totalBill = basket.calculateBill(basketList.stream());
					System.out.println("The estimated bill amount is Rs " + totalBill);
				}
			}
			else if(option == 3) {
				return;
			}
		}
		
	}
	
}