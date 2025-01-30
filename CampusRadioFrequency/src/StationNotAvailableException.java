//make the necessary change to make this class a Exception
public class StationNotAvailableException extends Exception{
	public StationNotAvailableException(String message) {
		super(message);
	}
}
