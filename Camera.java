package Encapsulation;

public class Camera {
	private String brand;
	private int price;
	private  String model;
	private Lens lens;
	
	public void SetBrand(String brand) {
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
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setLens(Lens lens) {
		this.lens=lens;
	}
	public Lens getLens() {
		return lens;
	}

}
