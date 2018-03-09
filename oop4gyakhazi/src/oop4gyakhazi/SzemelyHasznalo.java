package oop4gyakhazi;
import java.util.Scanner;
public class SzemelyHasznalo {
		public static void main(String[] args) {
			
			Szemely szemely = new Szemely();
			/*
			szemely.setName("Kiss Géza");
			szemely.setHeight(1.70);
			szemely.setWeight(70);
			*/
			Scanner eye = new Scanner(System.in);
			System.out.println("Kerem adja meg a nevet: ");
			szemely.setName(eye.nextLine());
			System.out.println("Kerem adja meg a magassagat(meterben): ");
			szemely.setHeight(Double.parseDouble(eye.nextLine()));
			System.out.println("Kerem adja meg a tomeget(kg-ban): ");
			szemely.setWeight(Integer.parseInt(eye.nextLine()));
			
			
			szemely.Tti(szemely.getWeight(), szemely.getHeight());
			szemely.Makeup(szemely.getTti());
			System.out.println(szemely.toString());
			
			eye.close();
		}
}
