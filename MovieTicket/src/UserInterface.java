import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
        // Fill the code
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter movie name");
		String movieName = sc.next();
		
		System.out.println("Enter no of bookings");
		int noOfBookings = sc.nextInt();
		
		System.out.println("Enter the available tickets");
		Ticket.setAvailableTickets(sc.nextInt());
		
		for (int i = 1; i <= noOfBookings; i++) {
            Ticket ticket = new Ticket();

            System.out.println("Enter the ticketid");
            ticket.setTicketId(sc.nextInt());

            System.out.println("Enter the price");
            ticket.setPrice(sc.nextInt());

            System.out.println("Enter the no of tickets");
            int noOfTickets = sc.nextInt();

            System.out.println("Available tickets: " + Ticket.getAvailableTickets());

            if (noOfTickets > Ticket.getAvailableTickets()) {
                System.out.println("Tickets are not available");
            } else {
                int totalAmount = ticket.calculateTicketCost(noOfTickets);
                System.out.println("Total amount: " + totalAmount);

                if (Ticket.getAvailableTickets() == 0) {
                    System.out.println("House full");
                    break;
                }
                
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
            }
		}
    }
}


