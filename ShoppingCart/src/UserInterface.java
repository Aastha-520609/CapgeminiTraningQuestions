import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		Products product = new Products();
		
		while(true) {
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				System.out.println("Enter the product");
				String prod = sc.nextLine();
				product.addProductToList(prod);
			}
			else if(choice == 2) {
				List<String> productList = product.getProductList();
				if(productList.isEmpty()) {
					System.out.println("The list is empty");
				}else {
					product.sortProductList();
					for(String prod: productList) {
						System.out.println(prod);
					}
				}
			}else if(choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}
		}
		
	}
}
