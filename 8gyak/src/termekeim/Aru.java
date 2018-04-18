package termekeim;

public class Aru {
	
	private String nev;
	private int ar;
	
	//Konstruktor
	public Aru(String nev, int ar) {
		super();
		this.nev = nev;
		this.ar = ar;
	}

	//ToString()
	@Override
	public String toString() {
		return "Nev:" + nev + ", Ar:" + ar;
	}

	//getAr
	public int getAr() {
		return ar;
	}
	
}
