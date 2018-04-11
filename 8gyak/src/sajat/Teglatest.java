package sajat;
public class Teglatest extends Hasab {
	
	private double a_oldal;
	private double b_oldal;
	
	public Teglatest(int magassag, double a_oldal, double b_oldal) {
		super(magassag);
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	@Override
	public int getAlapterulet() {
		return (int)(a_oldal * b_oldal);
	}

	@Override
	public String toString() {
		return "A_oldal: " + a_oldal + ", B_oldal: " + b_oldal + ", Magassag: " + getMagassag();
	}
	
	

}
