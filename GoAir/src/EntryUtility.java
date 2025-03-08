public class EntryUtility {
    public static boolean validateEmployeeId(String employeeId) throws InvalidEntryException {
    	if(employeeId.matches("GOAIR/[0-9]{4}$")) {
    		return true;
    	}
    	else {
    		throw new InvalidEntryException("Invalid entry details");
    	}
    }
    
    public static boolean validateDuration(int duration) throws InvalidEntryException {
        if(duration >= 1 && duration <= 5) {
        	return true;
        }else {
        	throw new InvalidEntryException("Invalid entry details");
        }  
    }
}