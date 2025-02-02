import java.util.*;

public class Car {

	Map<String,Integer> carMap=new TreeMap<String,Integer>();

	public Map<String, Integer> getCarMap(){
		return carMap;
	}
	
	public void setCarMap(Map<String, Integer> carMap) {
		this.carMap = carMap;
	}

	public void addCar(String name,int num)
	{
	  	if(!carMap.containsKey(name))
            carMap.put(name, num);
	}
	
	public int carByName(String name)
	{
		return carMap.getOrDefault(name, -1);	
	}
	
	public List<String> carByCount(int count)
	{
		 List<String> result = new ArrayList<>();
	        for (Map.Entry<String, Integer> entry : carMap.entrySet()) {
	            if (entry.getValue() >= count) {
	                result.add(entry.getKey());
	            }
	        }
	        return result.isEmpty() ? null : result;
	}
	
	public int totalCarsSold()
	{
		int total = 0;
        for (int count : carMap.values()) {
            total += count;
        }
        return total;
	}
	
}
