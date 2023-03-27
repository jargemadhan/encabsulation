package constructer;

public class UseLaptop {
	public static void main(String[]args) {
		Display d=new Display(14.4f,"LED");
		Laptop l=new Laptop("Dell","inspiron3511",60000,d);
		System.out.println(d);
		System.out.println(l);
	}

}
