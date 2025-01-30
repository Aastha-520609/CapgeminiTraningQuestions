
public class HealthEndowment extends Endowment {
	
	  private String healthCareCenter;
	  private int holderAge;

	  public HealthEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,
	                           String healthCareCenter, int holderAge) {
	        super(endowmentId, holderName, endowmentType, registrationDate);
	        this.healthCareCenter = healthCareCenter;
	        this.holderAge = holderAge;
	  }
	  
	  @Override
	  public double calculateEndowment() {
	        if (holderAge <= 30) {
	            return 120000.00;
	        } else if (holderAge > 30 && holderAge < 60) {
	            return 200000.00;
	        } else if (holderAge >= 60) {
	            return 500000.00;
	        }
	        return 0.00;
	   }
	  
	    public String getHealthCareCenter() {
	        return healthCareCenter;
	    }

	    public void setHealthCareCenter(String healthCareCenter) {
	        this.healthCareCenter = healthCareCenter;
	    }

	    public int getHolderAge() {
	        return holderAge;
	    }

	    public void setHolderAge(int holderAge) {
	        this.holderAge = holderAge;
	    }
}
