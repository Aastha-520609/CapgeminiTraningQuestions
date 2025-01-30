public class Ticket
{
    // Fill the code
	private int ticketId;
	private int price;
	private static int availableTickets;
	
	public int getTicketId() {
		return ticketId;
	}
	
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static int getAvailableTickets() {
		return availableTickets;
	}
	
	public static void setAvailableTickets(int availableTickets) {
		if (availableTickets > 0) {
            Ticket.availableTickets = availableTickets;
        }
	}
    
    public int calculateTicketCost(int noOfTickets)
    {
    	int aT = -1;
    	if(availableTickets >= noOfTickets) {
    		aT = noOfTickets * price;
    		availableTickets -= noOfTickets;
    	}
    	return aT;
    }
    
}