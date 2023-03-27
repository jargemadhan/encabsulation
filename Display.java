package constructer;

public class Display {
	private float size;
	private String quality;
	
	public void setSize(float size) {
		this.size=size;
	}
	public float getSize() {
		return size;
	}
	public void setQuality(String quality) {
		this.quality=quality;
	}
	public String getQuality() {
		return quality;
	}
	public Display(float size,String quality) {
		this.size=size;
		this.quality=quality;
	}
	public String toString( ) {
		return "Size="+size+", Quality="+quality;
	}

		
	}
	


