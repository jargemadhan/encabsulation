package Encapsulation;

public class UseCar {
	public static void main(String[]args) {
		Engine e=new Engine();
		e.setBrand("Ford");
		e.setFuelType("Diesel");
		Car c=new Car();
		c.setBrand("Audi");
		c.setPrice(4600000);
		c.setModel("xz");
		c.setColor("White");
		c.setEngine(e);
		System.out.println("CAR NAME="+c.getBrand()+", PRICE "+c.getPrice()+", MODEL="+c.getModel()+", COLOR+"+c.getColor());
		//System.out.println(c.getPrice());
		//System.out.println(c.getModel());
		//System.out.println(c.getColor());
		System.out.println("ENGINE BRAND="+c.getEngine().getBrand()+", FUELTYPE="+c.getEngine().getFuelType());
		//System.out.println(c.getEngine().getFuelType());
		System.out.println(c);
	}

}
