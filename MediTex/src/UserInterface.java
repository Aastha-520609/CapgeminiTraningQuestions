import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TabletUtil utility = new TabletUtil();
        
        System.out.println("Enter the number of tablets");
        int n = sc.nextInt();
        sc.nextLine().trim();
        
        System.out.println("Enter the tablet details");
        List<Tablet> list = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
        	String[] details = sc.nextLine().split(":");
        	
        	String name = details[0];
        	String brand = details[1];
        	LocalDate date = LocalDate.parse(details[2]);
        	int mg = Integer.parseInt(details[3]);
        	double price = Double.parseDouble(details[4]);
        	
        	list.add(new Tablet(name, brand, date, mg, price));
        }
        
        System.out.println("Enter the brand name");
        String brandName = sc.nextLine().trim();
        
        List<Tablet> brandList = utility.retrieveTabletsByBrand(list.stream(), brandName);
        
        if(brandList.isEmpty()) {
        	System.out.println("No tablets found for the brand " + brandName);
        }
        else {
        	System.out.println("Tablets by brand " + brandName + " are");
        	for(Tablet tablet: brandList) {
        		System.out.println(tablet);
        	}
        }
        
        System.out.println("Enter the minimum mg");
        int mg = sc.nextInt();
        List<String> mgList = utility.getTabletsAboveMg(list.stream(), mg);
        
        if(mgList.isEmpty()) {
        	System.out.println("No tablets found with a minimum mg of " + mg);
        }
        else {
        	System.out.println("Tablets with a minimum mg of " + mg + " are");
        	for(String tablet : mgList) {
        		System.out.println(tablet);
        	}
        }
        

    }
}
