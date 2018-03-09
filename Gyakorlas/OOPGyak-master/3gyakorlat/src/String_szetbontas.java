import java.util.Scanner;
public class String_szetbontas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kerem adja meg a kifejezest");
		String kifejezes = input.nextLine();
		String[] eredmenytomb = kifejezes.split(" ");
		double eredmeny;
		
		switch (eredmenytomb[1]) {
		case "+":
			eredmeny = Double.parseDouble(eredmenytomb[0]) + Double.parseDouble(eredmenytomb[2]);
			System.out.println("Az osszeadas eredmenye: ");
			System.out.println(eredmeny);
			break;
			
		case "-":
			eredmeny = Double.parseDouble(eredmenytomb[0]) - Double.parseDouble(eredmenytomb[2]);
			System.out.println("Az kivonas eredmenye: ");
			System.out.println(eredmeny);
			break;

		default:
			break;
		}
		input.close();
	}

}
