package mypersons.test;
import java.util.Scanner;
import mypersons.*;
public class SzemelyTest {
	public static void main(String[] args) {
		Szemely[] Szemelyek = new Szemely[2];
		Scanner eye = new Scanner(System.in);
		String nev;
		int kor;
		String allas;
		
		for (int i = 0; i < Szemelyek.length; i++) {
			System.out.println("Adja meg a(z) " + (i + 1) + ". szemely nevet!");
			nev = eye.nextLine();
			System.out.println("Adja meg a(z) " + (i + 1) + ". szemely korat!");
			kor = Integer.parseInt(eye.nextLine());
			if(kor < 18){
				System.out.println("Adja meg a(z)" + (i + 1) + ". gyermek iskolajat!");
				allas = eye.nextLine();
				Szemelyek[i] = new Gyermek(nev, kor, allas);
				System.out.println(Szemelyek[i]);
				System.out.println(Szemelyek[i].getClass());
			}
			else {
				System.out.println("Adja meg a(z) " + (i + 1) + ". felnott munkahelyet!");
				allas = eye.nextLine();
				Szemelyek[i] = new Felnott(nev, kor, allas);
				System.out.println(Szemelyek[i]);
				System.out.println(Szemelyek[i].getClass());
			}
			System.out.println(Szemelyek[0] instanceof Szemely);
			System.out.println(Szemelyek[0] instanceof Gyermek);
			System.out.println(Szemelyek[0] instanceof Felnott);
			System.out.println(Szemelyek[1] instanceof Szemely);
			System.out.println(Szemelyek[1] instanceof Gyermek);
			System.out.println(Szemelyek[1] instanceof Felnott);
			
		}
		eye.close();
	}

}
