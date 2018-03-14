public class TeglalapHasznalo {
	public static void main(String[] args) {
		Teglalap a = new Teglalap(3, 5);
		Teglalap b = new Teglalap(4, 9);
		Teglalap c = a;
		
		//A 3 téglalap kiíratása
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		
		// Az a téglalap változtatott értékei
		a.setOldalak(6, 8);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		// Az a téglalap változtatása úgy hogy megegyezzen a b téglalap értékeivel
		a.setOldalak(4, 9);
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.EggyenloOldalu(b));
		
		
	}

}
