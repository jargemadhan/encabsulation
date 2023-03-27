package constructer;

public class UseMobile {
	public static void main(String[]args) {
		Camera c=new Camera("sony","20mp");
		Mobile m=new Mobile("Apple","14pro",130000,c);
		System.out.println(m);
		System.out.println(c);
	}

}
