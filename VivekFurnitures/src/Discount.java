
public class Discount {
	
	public double calculateDiscount(Bero bObj) {
		    double discountPercentage = 0;
	        
	        if (bObj instanceof SteelBero) {
	            discountPercentage = 10;
	        } else if (bObj instanceof WoodenBero) {
	            discountPercentage = 15;
	        }
	        
	        double discount = (bObj.getPrice() * discountPercentage) / 100;
	        return discount;
	    }	
	}
