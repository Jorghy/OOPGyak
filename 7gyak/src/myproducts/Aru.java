package myproducts;
public class Aru {
	private String nev;
	private int nettoar;
	private int afakulcs;
	
	public Aru(String nev, int nettoar, int afakulcs) {
		super();
		this.nev = nev;
		this.nettoar = nettoar;
		this.afakulcs = afakulcs;
	}
	
	public int Bruttoar() {
		return (int)(nettoar * (1 + afakulcs / 100.0));
	}

	@Override
	public String toString() {
		return "Aru nev= " + nev + ", Brutto ar: " + Bruttoar();
	}
	
	public void Nettonoveles(int szazalek) {
		nettoar = (int)(nettoar * (1 + szazalek / 100.0));
	}
	
	public int NagyobbBruttoAru(Aru masik) {
		if (this.Bruttoar() > masik.Bruttoar()) {
			return 1;
		}
		else if (this.Bruttoar() < masik.Bruttoar()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
