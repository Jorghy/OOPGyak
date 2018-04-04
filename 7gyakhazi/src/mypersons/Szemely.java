package mypersons;
public class Szemely {
	private String nev;
	private int kor;
	
	public Szemely(String nev, int kor) {
		super();
		this.nev = nev;
		this.kor = kor;
	}

	public String getNev() {
		return nev;
	}

	public int getKor() {
		return kor;
	}

	@Override
	public String toString() {
		return "Nev: " + nev + ", Kor: " + kor;
	}
	
	public boolean KoraNagyobbMint(Szemely masik) {
		return kor > masik.kor;
	}
	
}
