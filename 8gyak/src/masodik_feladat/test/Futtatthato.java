package masodik_feladat.test;

import java.awt.Color;
import masodik_feladat.Szinezheto;
import masodik_feladat.pont.SzinesPont;
import termekeim.*;

public class Futtatthato {
	public static void main(String[] args) {
		Szinezheto szinespont = new SzinesPont(Color.BLUE);
		System.out.println(szinespont);
		
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		Szinvalto(szinespont);
		System.out.println(szinespont);
		
		Szinezheto toll = new Toll("toll", 2000,  Color.BLACK, "Parker");
		System.out.println(toll);
		toll.setSzin(Color.CYAN);
		System.out.println(toll);
		Szinvalto(toll);
		System.out.println(toll);
	}
	
	public static void Szinvalto(Szinezheto objektum){
		objektum.setSzin(Szinezheto.alapertelmezett);
	}

}
