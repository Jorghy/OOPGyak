
public class Szemely {
	String nev;
	int tomeg;
	double magassag;
	double tti;
	String alkat;
	
	public void Tti(int tomeg, double magassag) {
		tti = (tomeg/(magassag*magassag));
	}
	
	public void Alkat(double tti) {
		if(tti < 18.5) {
			alkat = "sovany";
		}
		else if(tti > 25) {
			alkat = "kover";
		}
		else {
			alkat = "normal";
		}
	}

	@Override
	public String toString() {
		return "Nev: " + nev + ", Tomeg: " + tomeg + "kg, Magassag: " + magassag + "m, TTi=" + tti + ", Alkat: "
				+ alkat;
	}
	
	
	
	
}
