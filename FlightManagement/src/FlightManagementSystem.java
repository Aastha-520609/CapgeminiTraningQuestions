import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.IOException;

public class FlightManagementSystem {
    public boolean addFlight(Flight flightObj) {
        String query = "INSERT INTO Flight(flightId, source, destination, noofseats, flightfare) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DB.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, flightObj.getFlightId());
            statement.setString(2, flightObj.getSource());
            statement.setString(3, flightObj.getDestination());
            statement.setInt(4, flightObj.getNoOfSeats());
            statement.setDouble(5, flightObj.getFlightFare());

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
