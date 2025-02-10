import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightManagementSystem fms = new FlightManagementSystem();
        
        System.out.println("Enter flight Id");
        int flightId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter source");
        String source = scanner.nextLine();

        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        System.out.println("Enter noOfSeats");
        int noOfSeats = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the fare");
        double flightFare = scanner.nextDouble();

        if (flightFare < 0 || flightFare > 999999.99) {
        	System.out.println("Flight details not added successfully");
        }else {
        	Flight flight = new Flight(flightId, source, destination, noOfSeats, flightFare);

            if (fms.addFlight(flight)) {
                System.out.println("Flight details added successfully");
            } else {
                System.out.println("Flight details not added successfully");
            }
        }
        
        scanner.close();
    }
}