package logos.lgs.lviv.four;

public class Main {

	public static void main(String[] args) {
		
		Frog f = new Frog();
		 f = (Frog)new Amphibia();
		 f.eat();
		 f.sleep();
		 f.swim();
		 f.walk();
	}

}
