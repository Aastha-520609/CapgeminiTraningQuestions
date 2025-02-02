import java.util.HashSet;

public class ClassHouseFormation {

	HashSet<String> studSet = new HashSet<String>();
	
	public HashSet<String> getStudSet() {
        return studSet;
    }

    public void setStudSet(HashSet<String> studSet) {
        this.studSet = studSet;
    }

	public void addName(String details)
	{
		String[] parts = details.split(":");
        if (parts.length == 2) {
            studSet.add(parts[1]);
        }
	}
	
	public HashSet<String> formTeam()
	{
		 HashSet<String> houseSet = new HashSet<>();
	     for (String name : studSet) {
	            char firstChar = name.charAt(0);
	            String house;
	            if (firstChar >= 'A' && firstChar <= 'H') {
	                house = "RED";
	            } else if (firstChar >= 'I' && firstChar <= 'P') {
	                house = "BLUE";
	            } else {
	                house = "GREEN";
	            }
	            houseSet.add(name + ":" + house);
	        }
	      return houseSet;
	}
}
