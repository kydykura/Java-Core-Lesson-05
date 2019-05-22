package logos.lviv.lgs.three;

public class Square {

	private int x;
	private int y;
	private int z;
	
	
	Square(int x, int y){
		this.x=x;
		this.y=y;
		z=0;
	}
		
	Square(int x, int y, int z){
		this(x,y);
		this.z=z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
	
	
}

