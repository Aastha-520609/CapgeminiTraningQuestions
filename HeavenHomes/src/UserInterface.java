import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
    	
        Scanner sc = new Scanner(System.in);
        Apartment apartment = new Apartment();
        
        System.out.println("Enter the number of details to be added");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the details (Apartment number: Rent)");
        for(int i=0; i<n; i++) {
        	String[] details = sc.nextLine().split(":");
        	
        	String apartmentNumber = details[0];
        	Double rent = Double.parseDouble(details[1]);
        	
        	apartment.addApartmentDetails(apartmentNumber, rent);	
        }
        
        System.out.println("Enter the range to filter the details");
        double min = sc.nextDouble();
        double max = sc.nextDouble();
        
        double result = apartment.findTotalRentOfApartmentsInTheGivenRange(min, max);
        
        if(result <= 0) {
        	System.out.println("No apartments found in this range");
        	return;
        }
        
        System.out.println("Total Rent in the range " + min + " to " +  max + " USD:" + result);
        
       
    }
}
