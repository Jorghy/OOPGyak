package sajat;
public abstract class Hasab {
	private int magassag;

	public Hasab(int magassag) {
		super();
		this.magassag = magassag;
	}

	public int getMagassag() {
		return magassag;
	}
	
	public abstract int getAlapterulet();
	
	public int getTerfogat() {
		return getAlapterulet() * magassag;
	}
	
	public boolean NagyobbTerfogatu(Hasab masik) {
		return getTerfogat() > masik.getTerfogat();
	}
}
