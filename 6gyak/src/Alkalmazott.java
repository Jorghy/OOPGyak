public class Alkalmazott {
	private String nev;
	private int kor;
	private long fizetes;
	private static int nyugdijkorhatar = 65;
	
	public Alkalmazott(String nev, int kor, long fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		super();
		this.nev = nev;
		this.kor = kor;
		fizetes = kor * 10000;
	}
	
	public int Nyugdijig() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return nev + " " + kor + " " + fizetes + " " + Nyugdijig();
	}
	
	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static Alkalmazott Fiatalabb(Alkalmazott egyik, Alkalmazott masik) {
		if(egyik.Nyugdijig() > masik.Nyugdijig()) {
			return egyik;
		}
		else {
			return masik;
		}
		
	}
	
	
}
