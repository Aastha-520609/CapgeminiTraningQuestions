import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManagementSystem
{
   public boolean updateFlightFare(int flightId, double flightFare) {
	   Connection connection = null;
	   PreparedStatement statement = null;
	   boolean isUpdated = false;
	   try {
		   connection = DB.getConnection();
		   String query = "UPDATE Flight SET flightFare = ? WHERE flightId = ?";
		   statement = connection.prepareStatement(query);
		   statement.setDouble(1, flightFare);
		   statement.setInt(2, flightId);
		   
		   int rows = statement.executeUpdate();
		   if(rows > 0) {
			   isUpdated = true;
		   }
	   }
	   catch(SQLException | ClassNotFoundException e) {
		   e.printStackTrace();
	   }
	   
	   return isUpdated;
   }
}