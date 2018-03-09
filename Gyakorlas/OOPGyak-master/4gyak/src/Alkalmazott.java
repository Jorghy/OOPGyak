
public class Alkalmazott {
	private String nev;
	private long fizetes;
	
	
	public void Emeltfiz(long emelt){
		fizetes += emelt;
	}


	@Override
	public String toString() {
		return "Alkalmazott neve: " + nev + ", fizetes: " + fizetes + "";
	}


	public String getNev() {
		return nev;
	}


	public void setNev(String nev) {
		this.nev = nev;
	}


	public long getFizetes() {
		return fizetes;
	}


	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}
	
	public boolean FizetesIntervallum(long also, long felso){
		return fizetes >= also && fizetes <= felso;
	}
	
	public long FizetendoAdo() {
		return (long)(fizetes * 0.16);
	}
	
	public boolean FizetesNagyobbMint(Alkalmazott masik){
		return fizetes > masik.fizetes;
	}
	
}
