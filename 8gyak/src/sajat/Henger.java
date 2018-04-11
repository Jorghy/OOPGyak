package sajat;

public class Henger extends Hasab {

	private double sugar;
	
	public Henger(int magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}
	
	@Override
	public int getAlapterulet() {
		return (int)(sugar * sugar * Math.PI);
	}

	@Override
	public String toString() {
		return "Sugar: " + sugar + ", Magassag: " + getMagassag();
	}
	
	

}
