package inheritance;

public class Vehical {
	private String light;
	private String handle;
	private String engin_type;
	private int wheels;
	private int max_speed;
	public Vehical() {
		this.light = "LED";
		this.handle = "Default";
		this.engin_type = "petrol";
		this.wheels = 4;
		this.max_speed = 150;
	}
	public String getLight() {
		return light;
	}
	public void setLight(String light) {
		this.light = light;
	}
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}
	public String getEngin_type() {
		return engin_type;
	}
	public void setEngin_type(String engin_type) {
		this.engin_type = engin_type;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}
	
	
	
	
	
	

}
