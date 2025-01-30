
public class Validator {

	public static boolean validateStation(float freq) throws StationNotAvailableException {
		
		if (freq == 91.2f || freq == 93.5f || freq == 98.9f || freq == 109.4f)
			return true;
		
		throw new StationNotAvailableException("The frequency " + freq + " is out of range");
	}
}
