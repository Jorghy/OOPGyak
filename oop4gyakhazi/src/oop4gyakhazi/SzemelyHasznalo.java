package oop4gyakhazi;

public class SzemelyHasznalo {
		public static void main(String[] args) {
			
			Szemely szemely = new Szemely();
			
			szemely.name = "Kiss Géza";
			szemely.height = 1.70;
			szemely.weight = 70;
			
			szemely.Tti(szemely.weight, szemely.height);
			szemely.Makeup(szemely.tti);
			System.out.println(szemely.toString());
		}
}
