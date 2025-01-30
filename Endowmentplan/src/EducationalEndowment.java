
public class EducationalEndowment extends Endowment {
	
	private String educationalInstitution;
    private String educationalDivision;
    
    public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,String educationalInstitution, String educationalDivision) {
              super(endowmentId, holderName, endowmentType, registrationDate);
              this.educationalInstitution = educationalInstitution;
              this.educationalDivision = educationalDivision;
    }
    
    @Override
	public double calculateEndowment() {
    	switch (educationalDivision.toLowerCase()) 
    	{
         case "school":
            return 30000.00;
         case "undergraduate":
            return 60000.00;
         case "postgraduate":
            return 90000.00;
         default:
            return 0.00;
        }
	}
    
    public String getEducationalInstitution() {
        return educationalInstitution;
    }

    public void setEducationalInstitution(String eduInstitution) {
        this.educationalInstitution = eduInstitution;
    }

    public String getEducationalDivision() {
        return educationalDivision;
    }

    public void setEducationalDivision(String eduDivision) {
        this.educationalDivision = eduDivision;
    }
}
