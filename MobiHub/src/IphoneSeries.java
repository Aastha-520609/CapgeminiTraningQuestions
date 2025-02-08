@SmartPhone(os = "IOS", version = 6)
class IphoneSeries {
	String model;
	double display;
	double price;
	
	public IphoneSeries(String model, double display, double price) {
		super();
		this.model = model;
		this.display = display;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getDisplay() {
		return display;
	}
	
	public void setDisplay(double display) {
		this.display = display;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateDiscount() {
		double discount=0;
		double amount=0;
		if(model.equals("iPhoneSE")) {
			if(display>=5.0 && display<=6.0)
				discount=price*0.05;
			else if(display>=6.1 && display<=7.0)
				discount=price*0.10;
				amount=price-discount;
		}
		else if(model.equals("iPhone13ProMax")) {
			if(display>=5.0 && display<=6.0)
				discount=price*0.06;
			else if(display>=6.1 && display<=7.0)
				discount=price*0.09;
			amount=price-discount;
		}
		else if(model.equals("iPhone13Pro")) {
			if(display>=5.0 && display<=6.0)
				discount=price*0.04;
			else if(display>=6.1 && display<=7.0)
				discount=price*0.11;
			amount=price-discount;
		}
		else if(model.equals("iPhone13")) {
			if(display>=5.0 && display<=6.0)
				discount=price*0.08;
			else if(display>=6.1 && display<=7.0)
				discount=price*0.12;
			amount=price-discount;
		}
		return amount;
	}
	
	 public void displayDetails() {
	        System.out.println("iPhone Details");
	        System.out.println("Model : " + model);
	        System.out.println("Display in (inches): " + display);
	        System.out.println("Price : " + price);
	        System.out.println("Amount to be paid : " + calculateDiscount());
	        
	        SmartPhone annotation = this.getClass().getAnnotation(SmartPhone.class);
	        if (annotation != null) {
	            System.out.println("OS : " + annotation.os());
	            System.out.println("Version : " + annotation.version());
	        }
	    }
	
}