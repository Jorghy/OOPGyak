package masodik_feladat.pont;
public class Pont {
	private int x_koordinata;
	private int y_koordinata;
	
	public Pont(int x_koordinata, int y_koordinata) {
		super();
		this.x_koordinata = x_koordinata;
		this.y_koordinata = y_koordinata;
	}

	@Override
	public String toString() {
		return "X_koordinata: " + x_koordinata + ", Y_koordinata: "+ y_koordinata;
	}
	
	
	
}
