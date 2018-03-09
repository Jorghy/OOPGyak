
public class SzemelyHasznalo {
	public static void main(String[] args) {
		
		Szemely szemely = new Szemely();
		
		szemely.nev = "Kiss Géza";
		szemely.tomeg = 70;
		szemely.magassag = 1.70;
		
		szemely.Tti(szemely.tomeg, szemely.magassag);
		szemely.Alkat(szemely.tti);
		System.out.println(szemely.toString());
	}

}
