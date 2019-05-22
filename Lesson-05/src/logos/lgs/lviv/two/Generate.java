package logos.lgs.lviv.two;

public class Generate {
	public String text;
	
	public String Generete() {
		int random_number = (int) (Math.random() * 2);
	      
		if (random_number==1) {
			text="Орел";
		} else {
			text="копійка";
		}
	      
	return 	text;
	};
}
