import java.util.List;
import java.util.stream.Stream;

public class FruitBasketUtility{
	
	private List<FruitBasket> fruitBasketList;
	
	public List<FruitBasket> getFruitBasketList(){
		return fruitBasketList;
	}
	
	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}
	
	public void addToBasket(FruitBasket fbObj) {
		fruitBasketList.add(fbObj);
	}
	
	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
		return fruitBasketStream.mapToInt(fb -> fb.getPricePerKg() * fb.getWeightInKgs()).sum();
	}
}