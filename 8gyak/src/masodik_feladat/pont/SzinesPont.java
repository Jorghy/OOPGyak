package masodik_feladat.pont;

import java.awt.Color;
import masodik_feladat.Szinezheto;

public class SzinesPont extends Pont implements Szinezheto {
		private Color szin;

		public SzinesPont(int x_koordinata, int y_koordinata, Color szin) {
			super(x_koordinata, y_koordinata);
			this.szin = szin;
		}
		
		public SzinesPont(Color szin){
			super(0,0);
			this.szin = szin;
		}

		@Override
		public String toString() {
			return "SzinesPont [szin=" + szin + ", toString()="
					+ super.toString() + "]";
		}
		
		@Override
		public Color getAlapertelmezett(){
			return alapertelmezett;
		}
		
		@Override
		public void setAlapertelmezett(Color szin){
			this.szin = szin;
		}
}
