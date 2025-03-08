import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EarphoneUtil utility = new EarphoneUtil();
        
        System.out.println("Enter the number of earphones");
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Earphone> earphoneList = new ArrayList<>();
        
        System.out.println("Enter the earphone details");
        for(int i = 0; i < n; i++) {
        	String[] details = sc.nextLine().split(":");
        	String name = details[0];
        	LocalDate date = LocalDate.parse(details[1]);
        	double price = Double.parseDouble(details[2]);
        	double rating = Double.parseDouble(details[3]);
        	
        	earphoneList.add(new Earphone(name, date, price, rating));
        }
        
        System.out.println("Enter the brand name");
        String brandName = sc.nextLine();
        
        List<Earphone> result = utility.getEarphonesByBrandName(earphoneList.stream(), brandName).toList();
        
        if(result.isEmpty()) {
        	System.out.println("No earphones found for the brand " + brandName);
        }
        else 
        {
        	 System.out.println("Earphones by brand " + brandName + " are");
             for (Earphone e : result) {
                 System.out.println(e);
                }
        }
        
        System.out.println("Enter the minimum and maximum price range");
        double min = sc.nextDouble();
        double max = sc.nextDouble();
        
        List<Earphone> priceList = utility.getEarphonesWithinPriceRange(earphoneList.stream(), min, max);
        
        if (priceList.isEmpty()) {
            System.out.println("No earphones found within the price range " + min + " to " + max);
        } else {
            System.out.println("Earphones within the price range " + min + " to " + max + " are");
            for(Earphone e : priceList) {
            	System.out.println(e);
            }
        }
   }
}

