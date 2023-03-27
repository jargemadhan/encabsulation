package constructer;

public class Laptop {
	private String brand;
	private String model;
	private int price;
	private Display display;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
		
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setDisplay(Display display) {
		this.display=display;
	}
	public Display getDisplay() {
		return display;
	}
	public Laptop(String brand,String model,int price,Display display) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.display=display;
	}
	public String toString() {
		return "Brand="+brand+", Model="+model+", Price="+price+", display="+display;
	}
}
