package Encapsulation;

public class UseShirt {
	public static void main(String[]args) {
	Botton b=new Botton();
	b.setBbrand("madh");
	b.setBcolor("White");
	
	Shirt s=new Shirt();
	s.setBrand("Otto");
	s.setPrice(1200);
	s.setBotton(b);
	
	System.out.println("BRAND NAME="+s.getBrand()+", PRICE="+s.getPrice()+", BOTTON BRAND="+s.getBotton().getBbrand()+", COLOR="+s.getBotton().getBcolor());
	
	}	

}
