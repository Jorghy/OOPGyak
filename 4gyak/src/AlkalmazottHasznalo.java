
public class AlkalmazottHasznalo {
	public static void main(String[] args) {
		
		Alkalmazott alkalmazott = new Alkalmazott();
		Alkalmazott masik = new Alkalmazott();
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		
		/*
		Private nélkül 
		alkalmazott.nev = "Kiss Béla";
		alkalmazott.fizetes = 10;
		*/
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("XY");
			alkalmazottak[i].setFizetes((long)(Math.random() * 50));
			System.out.println(alkalmazottak[i].toString());
		}
		
		int legmagasabb = 0;
		for (int i = 1; i < alkalmazottak.length; i++) {
			if(alkalmazottak[i].getFizetes() >= alkalmazottak[legmagasabb].getFizetes()){
				legmagasabb = i;
			}
			
		}
		
		alkalmazottak[legmagasabb].toString();

	}

}
