
public class Teglalap {
		private int a;
		private int b;
		
		public Teglalap(int a, int b) {
			setOldalak(a, b);
		}
		
		public Teglalap(int oldalhossz){
			setOldalak(oldalhossz, oldalhossz);
		}
		
		public int Terulet() {
			return a*b;
		}

		@Override
		public String toString() {
			return "A oldal: "+ a +", B oldal: "+ b +", Terulet: " + Terulet();
		}

		public void setOldalak(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public boolean NagyobbTeruletu(Teglalap masik) {
			return Terulet() > masik.Terulet();
		}
		
		public boolean EggyenloOldalu(Teglalap masik) {
			return ((a == masik.a) && (b == masik.b));
		}
		
		
}
