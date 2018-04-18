package matematika;

import polinomok.LinearisPolinom;
import java.util.Scanner;

public class Futtathato {
	public static void main(String[] args) {
		LinearisPolinom EgyenesEgyenlete = new LinearisPolinom(2, 3);
		System.out.println(EgyenesEgyenlete);
		Scanner eyes = new Scanner(System.in);
		double a;
		double b;
		
		LinearisPolinom Polinomok[] = new LinearisPolinom[5];
		for (int i = 0; i < Polinomok.length; i++) {
			System.out.println("Adja meg az a erteket!");
			a = Double.parseDouble(eyes.nextLine());
			System.out.println("Adja meg a b erteket!");
			b = Double.parseDouble(eyes.nextLine());
			Polinomok[i] = new LinearisPolinom(a, b);
		}
		
		for (int i = 0; i < Polinomok.length; i++) {
			System.out.println(Polinomok[i]);
		}
		
		fvTablazat(Polinomok[4]);
	
		eyes.close();
	}
	public static void fvTablazat(Polinom polinom){
		System.out.println("x\ty");
		for (double i = 0; i <= 1; i += 0.1) {
			System.out.printf("%4.2f\t", i);
			//System.out.println(polinom.szamol(i));
			System.out.printf("%.2f\n", polinom.szamol(i));
		}
	}

}
