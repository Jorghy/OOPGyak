package termekeim;

import java.awt.Color;
import masodik_feladat.Szinezheto;

public class Toll extends Aru implements Szinezheto {

	private Color szin;
	private String marka;
	
	public Toll(String nev, int ar, Color szin, String marka) {
		super(nev, ar);
		this.szin = szin;
		this.marka = marka;
	}

	@Override
	public String toString() {
		return  super.toString() + ", Szin: " + szin + ", Marka: " + marka;
	}
	
	@Override
	public Color getSzin(){
		return szin;
	}
	
	@Override
	public void setSzin(Color szin){
		this.szin = szin;
	}
	
	
	
	
	
}
