public class GadgetValidatorUtil {
    public boolean validateGadgetID(String gadgetID) throws InvalidGadgetException {
        if(gadgetID.matches("^[A-Z]{1}[0-9]{3}$"))
        {
        	return true;
        }
        else {
        	throw new InvalidGadgetException("Invalid gadget ID");
        }
    }

    public boolean validateWarrantyPeriod(int period) throws InvalidGadgetException {
        if(period >= 6 && period <= 36) {
        	return true;
        }else {
        	throw new InvalidGadgetException("Invalid warranty period");
        }
    }
}
