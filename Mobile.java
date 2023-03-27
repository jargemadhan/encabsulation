package constructer;

public class Mobile {
	private String brand;
	private String model;
	private int price;
	private Camera camera;
	
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
	public void setCamera(Camera camera) {
		this.camera=camera;
	}
	public Camera getCamera() {
		return camera;
	}
	public Mobile(String brand,String model,int price,Camera camera) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.camera=camera;
	}
	public String toString() {
		return "BRAND="+brand+", MODEL="+model+", PRICE="+price+", CAMERA="+camera;
		
	}

}
