package myproducts;
public class Kenyer extends Aru {
	private double mennyiseg;

	public Kenyer(String nev, int nettoar, int afakulcs, double mennyiseg) {
		super(nev, nettoar, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return super.toString() + ", Egyseg ar: " + Bruttoar() / mennyiseg ;
	}

	public double getMennyiseg() {
		return mennyiseg;
	}
	
	public static boolean ElsoKenyerNagyobbEgysegAru(Kenyer elso, Kenyer masik){
		return (elso.Bruttoar() / elso.mennyiseg) > (masik.Bruttoar() / masik.mennyiseg);
	}
	
}
