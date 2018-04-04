package mypersons;
public class Gyermek extends Szemely {
	private String iskola;

	public Gyermek(String nev, int kor, String iskola) {
		super(nev, kor);
		this.iskola = iskola;
	}

	@Override
	public String toString() {
		return  super.toString() + ", Iskola: " + iskola;
	}

	public String getIskola() {
		return iskola;
	}
	
	
	
}
