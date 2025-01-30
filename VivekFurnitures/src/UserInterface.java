import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name");
        String customerName = sc.nextLine();

        System.out.println("Enter Phone Number");
        long phoneNumber = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter address");
        String address = sc.nextLine();
        
        CustomerDetails customer = new CustomerDetails(customerName, phoneNumber, address);

        System.out.println("Enter Bero Type");
        String beroType = sc.nextLine();
        
        Bero bero = null;
        
        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = sc.nextLine();

            System.out.println("Enter Bero Height");
            int beroHeight = sc.nextInt();

            bero = new SteelBero(beroType, beroColour, beroHeight);
            bero.calculatePrice();
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = sc.nextLine();

            System.out.println("Enter Wood Type");
            String woodType = sc.nextLine();

            bero = new WoodenBero(beroType, beroColour, woodType);
            bero.calculatePrice();
        } else {
            System.out.println(beroType + " is an invalid bero type");
            return;
        }
        
        Discount discount = new Discount();
        double discountAmount = discount.calculateDiscount(bero);

        double totalPrice = bero.getPrice() - discountAmount;

        System.out.printf("Amount needs to be paid %.2f\n", totalPrice);
	}

}
