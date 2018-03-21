import java.util.*;
public class AlkalmazottFutatthato {
	public static void main(String[] args) {
		int darab;
		Scanner eye = new Scanner(System.in);
		System.out.println("Mennyi alkalmazottat szeretnel beolvasni? ");
		darab = eye.nextInt();
		Alkalmazott[] Alkalmazottak = new Alkalmazott[darab];
		Random veletlen = new Random();
		
		for (int i = 0; i < Alkalmazottak.length; i++) {
			Alkalmazottak[i] = new Alkalmazott("XY"+(i+1), veletlen.nextInt(Alkalmazott.getNyugdijkorhatar()));
			System.out.println(Alkalmazottak[i].toString());;
		}
		
		System.out.println("Az uj nyugdijkorhatar!");
		System.out.println("Adja meg az uj nyugdijkorhatart!");
		int ujhatar = eye.nextInt();
		Alkalmazott.setNyugdijkorhatar(ujhatar);
		for (int i = 0; i < Alkalmazottak.length; i++) {
			System.out.println(Alkalmazottak[i].toString());;
		}
		
		System.out.println("Azon alkalmazottak akiknek 5 evnel kevesebb van nyugdijig!");
		for (int i = 0; i < Alkalmazottak.length; i++) {
			if (Alkalmazottak[i].Nyugdijig() < 5) {
				System.out.println(Alkalmazottak[i].toString());;
			}
		}
		
		System.out.println("Azon alkalmazottak akiknek az atlagnal tobb eve van meg nyugdijig!");
		int ossz = 0;
		double atlag = 0;
		for (int i = 0; i < Alkalmazottak.length; i++) {
			ossz += Alkalmazottak[i].Nyugdijig();
		}
		atlag = ossz / darab;
		for (int i = 0; i < Alkalmazottak.length; i++) {
			if (Alkalmazottak[i].Nyugdijig() > atlag) {
				System.out.println(Alkalmazottak[i].toString());;
			}
		}
		
		eye.close();
	}

}
