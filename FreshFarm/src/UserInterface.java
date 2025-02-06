import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UserInterface {
	public static void main(String [] args)
	{	
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cartons");
        
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine().trim());
            if (n <= 0) {
                System.out.println("Invalid");
                return;
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid");
            return;
        }
		
        List<Carton> cartonList = new ArrayList<>();
        System.out.println("Enter carton details");

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().trim().split("/");
            if (input.length != 3) {
                System.out.println("Invalid input format");
                return;
            }
        
            try {
                String productName = input[0].trim();
                int quantity = Integer.parseInt(input[1].trim());
                double productCost = Double.parseDouble(input[2].trim());
                
                if (quantity <= 0) {
                    System.out.println("Quantity number should be a valid number");
                    return;
                }
                cartonList.add(new Carton(productName, quantity, productCost));
            } 
            catch (NumberFormatException e) {
                System.out.println("Quantity number should be a valid number");
                return;
            }
        }
        
        CartonUtility cu = new CartonUtility();
        cu.setCartonList(cartonList);
        
        Carton maxCarton = cu.findMax(cu.convertToStream());
        
        if(maxCarton != null) {
        	System.out.println(maxCarton.getProductName() + " had the highest quantity with " + maxCarton.getQuantity() + " nos");
        }

	}
}
