
public class Product {
	//Include the attributes
	private int productId;
	private String productName;
	private double price;
	
	//Include three argument constructor to initialize values	
	public Product(int productId, String productName, double price){
			this.productId = productId;
			this.productName = productName;
			this.price = price;
		}
	
	//Include the getters and setters for the attributes
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName() {
		this.productName = productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice() {
		this.price = price;
	}
	
	//This method should return the productId, productName and price seperated by whitespace
	@Override
	public String toString()
    {
            return productId + " " + productName + " " + price;
    }
}
