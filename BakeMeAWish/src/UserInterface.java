import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface{
    public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   CakeOrder order = new CakeOrder();
       
	   System.out.println("Enter number of cake orders to be added");
	   int orders = sc.nextInt();
	   sc.nextLine();
	   
	   System.out.println("Enter the cake order details (Order Id: CakeCost)");
	   for(int i=0; i<orders; i++) {
		   String[] details = sc.nextLine().split(":");
		   String orderId = details[0];
		   double cakeCost = Double.parseDouble(details[1]);
		   order.addOrderDetails(orderId, cakeCost);
	   }
	   
	   System.out.println("Enter the cost to search the cake orders");
	   int cost = sc.nextInt();
	   
	   Map<String, Double> result = order.findOrdersAboveSpecifiedCost(cost);
	   
	   if(result.isEmpty()) {
		   System.out.println("No cake orders found");
		   return;
	   }
	   
	   System.out.println("Cake Orders above the specified cost");
	   for(Map.Entry<String, Double> entry : result.entrySet()) {
		   System.out.println("Order ID: " + entry.getKey() + ", Cake Cost: " +  entry.getValue());
	   }
	   

	}
}