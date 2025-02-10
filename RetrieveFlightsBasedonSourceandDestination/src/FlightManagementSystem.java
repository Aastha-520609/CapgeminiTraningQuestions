import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightManagementSystem
{
    public ArrayList<Flight> viewFlightsBySourceAndDestination(String source, String destination){
    	ArrayList<Flight> list = new ArrayList<Flight>();
    	Connection connection = null;
    	PreparedStatement statement = null;
    	ResultSet result = null;
    	
    	try {
    		connection = DB.getConnection();
    		String query = "SELECT * FROM Flight WHERE source = ? AND destination = ?";
    		statement = connection.prepareStatement(query);
    		statement.setString(1, source);
    		statement.setString(2, destination);
    		result = statement.executeQuery();
    		
    		while(result.next()) {
    			int flightId = result.getInt("flightId");
                String src = result.getString("source");
                String desc= result.getString("destination");
                int noOfSeats = result.getInt("noOfSeats");
                double flightFare = result.getDouble("flightFare");

                Flight flight = new Flight(flightId, src, desc, noOfSeats, flightFare);
                list.add(flight);
    		}
    		
    	}catch(SQLException | ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	return list;
    }
    
}