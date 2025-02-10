import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManagementSystem
{
   public boolean deleteFlight(int flightId) {
	   Connection connection = null;
	   PreparedStatement statement = null;
	   boolean isDeleted = false;
	   
	   try {
		   connection = DB.getConnection();
		   String query = "DELETE FROM Flight WHERE flightId = ?";
		   statement = connection.prepareStatement(query);
		   statement.setInt(1, flightId);
		   
		   int rowsDeleted = statement.executeUpdate();
           if (rowsDeleted > 0) {
               isDeleted = true;
           }
		   
	   }
	   catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
	   }
	   
	   return isDeleted;
   }
}