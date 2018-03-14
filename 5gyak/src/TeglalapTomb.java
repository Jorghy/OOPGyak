import java.util.Scanner;
public class TeglalapTomb {
	public static void main(String[] args) {
		Scanner eye = new Scanner(System.in);
		Teglalap[] Teglalapok = new Teglalap[10];
		
		for (int i = 0; i < Teglalapok.length; i++) {
			Teglalapok[i] = new Teglalap((int) ((Math.random()*9)+2),(int) ((Math.random()*9))+2);
			System.out.println(Teglalapok[i].toString());
		}
		
		int legkissebb = 0;
		for (int i = 1; i < Teglalapok.length ; i++) {
			if (Teglalapok[i].Terulet() < Teglalapok[legkissebb].Terulet() ) {
				legkissebb = i;
			}
		}
		System.out.println("A legkissebb teruletu teglalap adatai: " + Teglalapok[legkissebb].toString());
		System.out.println("Adja meg a teglalap elso oldalat!");
		int a = eye.nextInt();
		System.out.println("Adja meg a teglalap masik oldalat!");
		int b = eye.nextInt();
		Teglalap beolvasott = new Teglalap(a, b);
		
		int darab = 0;
		for (int i = 0; i < Teglalapok.length; i++) {
			if (Teglalapok[i].Terulet() < beolvasott.Terulet()) {
				darab+=1;
			}
		}
		System.out.println("A beolvasottnal kissebb teruletuek szama: " + darab);
		
		int j = 0;
		while (j < Teglalapok.length && !(Teglalapok[j].EggyenloOldalu(beolvasott))) {
			j++;
			
		}
		if (j < Teglalapok.length) {
			System.out.println("Az egyenlo oldalu telalap sorszama: " + j);
		}
		else{
			System.out.println("Nincs a beolvasottal megegyezo oldalu teglalap!");
		}
		
		eye.close();
	}

}
