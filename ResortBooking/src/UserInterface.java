import java.util.Scanner;
public class UserInterface {	
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the customer details");
      String input = sc.nextLine();
      
      String[] details = input.split(":");
      
      String customerName = details[0];
      int adults = Integer.parseInt(details[1]);
      int children = Integer.parseInt(details[2]);
      int days = Integer.parseInt(details[3]);
      
      if(adults < 0) {
    	  System.out.println("Invalid input for number of adults");
		  return;
	  }
		
	  if(children < 0) {
		  System.out.println("Invalid input for number of children");
		  return;
	  }
		
	  if(days <= 0) {
		  System.out.println("Invalid input for number of days");
		  return;
	  }
      
	  int adultCost = 1000;
	  int childCost = 650;
	  int price = (adults * adultCost + children * childCost) * days;
	  System.out.println(customerName + " your booking is confirmed and the total cost is " + price);
      
    }
}
