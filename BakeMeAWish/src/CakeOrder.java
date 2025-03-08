import java.util.Map;
import java.util.HashMap;

public class CakeOrder {

	private Map<String,Double> orderMap = new HashMap<String,Double>();

	public Map<String, Double> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Double> orderMap) {
		this.orderMap = orderMap;
	}
    
    public void addOrderDetails(String orderId, double cakeCost) {
		orderMap.put(orderId, cakeCost);
	}
	
	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost) {
		Map<String, Double> result = new HashMap<>();
		
		for(Map.Entry<String, Double> entry : orderMap.entrySet()) {
			if(entry.getValue() > cakeCost) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		
		return result;
	}


}
