
public class SteelBero extends Bero {
	    private int beroHeight;

	    public SteelBero(String beroType, String beroColour, int beroHeight) {
	        super(beroType, beroColour);
	        this.beroHeight = beroHeight;
	    }

	    public int getBeroHeight() {
	        return beroHeight;
	    }

	    public void setBeroHeight(int beroHeight) {
	        this.beroHeight = beroHeight;
	    }

	    @Override
	    public void calculatePrice() {
	        switch (beroHeight) {
	            case 3:
	                price = 5000;
	                break;
	            case 5:
	                price = 8000;
	                break;
	            case 7:
	                price = 10000;
	                break;
	            default:
	                price = 0;
	                break;
	        }
	    }
}
