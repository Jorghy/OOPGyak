package masodik_feladat.test;

import java.awt.Color;
import masodik_feladat.Szinezheto;
import masodik_feladat.pont.SzinesPont;

public class Futtatthato {
	public static void main(String[] args) {
		Szinezheto szinespont = new SzinesPont(Color.BLUE);
		System.out.println(szinespont);
		
		szinespont.setAlapertelmezett(Color.GREEN);
		System.out.println(szinespont);
		Szinvalto(szinespont);
		System.out.println(szinespont);
	}
	
	public static void Szinvalto(Szinezheto objektum){
		objektum.setAlapertelmezett(objektum.alapertelmezett);
	}

}
