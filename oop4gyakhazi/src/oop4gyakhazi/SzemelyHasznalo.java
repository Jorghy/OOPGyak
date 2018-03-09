package oop4gyakhazi;

public class SzemelyHasznalo {
		public static void main(String[] args) {
			
			Szemely szemely = new Szemely();
			
			szemely.setName("Kiss Géza");
			szemely.setHeight(1.70);
			szemely.setWeight(70);
			
			szemely.Tti(szemely.getWeight(), szemely.getHeight());
			szemely.Makeup(szemely.getTti());
			System.out.println(szemely.toString());
		}
}
