package myproducts;
public class Futtathato {
	public static void main(String[] args) {
/*
a) Készítsen egy futtatható osztályt a myproducts alcsomagjában. Ebben hozzon létre egy Áru és egy Kenyér objektumot. 
   Írja ki az adataikat, és hasonlítsa össze az árukat.
 */
		Aru sajt = new Aru("Sajt", 500, 27);
		Kenyer feherkenyer = new Kenyer("Feher Kenyer", 250, 20, 0.75);
		
		System.out.println(sajt.toString());
		System.out.println(feherkenyer.toString());
		System.out.println(sajt.NagyobbBruttoAru(feherkenyer));
		
/*
b)   Hozzon   létre   még   egy   Kenyér   típusú   objektumot,   de   ennek   a   referenciáját   egy   Áru   típusú
	 változóban tárolja (neve: product2). Próbálja ki, hogy a "product2" referenciára meghívva milyen
	 eredményt   ad   a   toString   metódus.   Meg   tudja-e   hívni   ezen   a   referencián   keresztül   a   Kenyér
	 mennyiségét visszaadó metódust?
*/
		Aru product2 = new Kenyer("Barna Kenyer", 300, 20, 0.5);
		System.out.println(product2); // A Kenyer toString() metodusát adja vissza.
		// product2.getMennyiseg(); Nem lehet meghívni!
		
/*
	c) Hozzon létre még egy Kenyér példányt (neve: bread2) és a "product2" referenciával hivatkozott 
	másik Kenyérrel összehasonlítva a nagyobb egységárút kell kiírni (konvertálásra lesz szükség).
 */
		Kenyer bread2 = new Kenyer("Rozskenyer", 350, 20, 0.5);
		if (Kenyer.ElsoKenyerNagyobbEgysegAru((Kenyer)product2, bread2)) {
			System.out.println(product2);
		}
		else {
			System.out.println(bread2);
		}
	}

}
