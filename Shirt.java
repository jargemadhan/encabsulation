package Encapsulation;

public class Shirt {
	private String brand;
	private int price;
	private Botton botton;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setBotton(Botton botton) {
		this.botton=botton;
	}
	public Botton getBotton() {
		return botton;
	}
	
	

}
