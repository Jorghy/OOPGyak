package sajat.test;
import sajat.Henger;
import sajat.Teglatest;

public class Futtathato {
	public static void main(String[] args) {
		
		Henger henger = new Henger(1, 1);
		System.out.println(henger.toString() + ", Terfogat: " + henger.getTerfogat());
		
		Teglatest teglatest = new Teglatest(1, 1, 3);
		System.out.println(teglatest.toString() + ", Terfogat: " + teglatest.getTerfogat());
		
		System.out.println(henger.NagyobbTerfogatu(teglatest));
	}

}
