import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc = new Scanner(System.in);
       
       String[] cities = {"Chennai", "Coimbatore", "Erode", "Karur", "Madurai", "Hyderabad", "Salem", "Bangalore", "Delhi", "Agra"};
       System.out.println("Enter the city name");
       String city = sc.nextLine();
       city = city.toLowerCase();
       
       boolean busAvailable = false;
       
       for(int i = 0; i<cities.length; i++) {
    	   if(cities[i].toLowerCase().equals(city)) {
    		   System.out.println("Bus for " + city + " is available");
    		   busAvailable = true;
    		   break;
    	   }
       } 
       
       if(!busAvailable) {
    	   System.out.println("Bus for " + city + " is not available");
       }
    }
}