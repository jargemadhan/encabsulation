package constructer;

public class Camera {
	String brand;
	String mp;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public Camera(String brand,String mp) {
		this.brand=brand;
		this.mp=mp;
	}
	public String toString() {
		return "BRAND="+brand+", MP="+mp;
	}

}
