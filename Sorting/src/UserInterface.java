import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class UserInterface {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the products count");
	    int productCount = sc.nextInt();
	    sc.nextLine();

	    if (productCount <= 0) {
	         System.out.println("Invalid count");
	         return;
	    }
		
	    Product[] products = new Product[productCount];
	    System.out.println("Enter Product details");
        for (int i = 0; i < productCount; i++) {
            String[] details = sc.nextLine().split(":");
            
            int id = Integer.parseInt(details[0]);
            String name = details[1];
            double price = Double.parseDouble(details[2]);
            products[i] = new Product(id, name, price);
        }
        
        System.out.println("1.Sort By Id\n2.Sort By Price\nEnter your choice");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            Arrays.sort(products, new SortById());
            System.out.println("After Sorting By Id");
        } else if (choice == 2) {
            Arrays.sort(products, new SortByPrice());
            System.out.println("After Sorting By Price");
        } else {
            System.out.println("Invalid choice");
            return;
        }
        
        for (Product product : products) {
            System.out.println(product);
        }
		
	}

}
