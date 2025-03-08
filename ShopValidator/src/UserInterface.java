import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GadgetValidatorUtil utility = new GadgetValidatorUtil();
       
        System.out.println("Enter the number of gadget entries");
        int entries = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<entries; i++) {
        	System.out.println("Enter gadget " + (i+1) + " details");
        	String[] details = sc.nextLine().split(":");
        	
        	String gadgetID = details[0];
        	String gadgetType = details[1];
        	int period = Integer.parseInt(details[2]);
        	
        	try {
				if( utility.validateGadgetID(gadgetID) && utility.validateWarrantyPeriod(period)){        	
					System.out.println("Warranty accepted, stock updated");
				}
			} catch (InvalidGadgetException e) {
				System.out.println(e.getMessage());
			}
        }
    }
}
