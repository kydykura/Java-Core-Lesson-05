package logos.lviv.lgs.three;

public class Application {

	public static void main(String[] args) {
		
		Square s1 = new Square(3,4);
		System.out.println(s1.getZ());
		
		Square s2 = new Square(3,4,5);
		System.out.println(s2.getZ());
	}

}
