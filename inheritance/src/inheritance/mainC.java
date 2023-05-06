package inheritance;

public class mainC {

	public static void main(String[] args) {
		Vehical vehical=new Vehical();
		bike Bike= new bike("short");
		Bike.setEngin_type("petrol");
		Bike.getWheels();
		System.out.println(Bike.getHandle());
				
		System.out.println(Bike.getEngin_type());

	}

}
