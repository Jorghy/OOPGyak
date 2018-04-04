package mypersons;
public class Felnott extends Szemely {
	private String munkahely;

	public Felnott(String nev, int kor, String munkahely) {
		super(nev, kor);
		this.munkahely = munkahely;
	}

	@Override
	public String toString() {
		return super.toString() + ", Munkahely: " + munkahely;
	}

	public String getMunkahely() {
		return munkahely;
	}
	
	
}
