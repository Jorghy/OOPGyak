import java.util.Scanner;

public class kalkulator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double eredmeny;
		
		System.out.println("Kerem adja meg az elso operandust: ");
		double elso = input.nextDouble();
		
		System.out.println("Kerem adja meg a masodik operandust: ");
		double masodik = input.nextDouble();
		
		System.out.println("Kerem adja meg az operatort: ");
		String operator = input.nextLine();
		operator = input.nextLine();
		
		switch (operator) {
		case "+":
			System.out.println("osszeadas");
			eredmeny = elso+masodik;
			System.out.println("Az a + b osszege: "+ eredmeny);
			break;
			
		case "-":
			System.out.println("kivonas");
			eredmeny = elso - masodik;
			System.out.println("Az a - b osszege: "+ eredmeny);
			break;
			
		case "*":
			System.out.println("szorzas");
			eredmeny = elso * masodik;
			System.out.println("Az a * b osszege: "+ eredmeny);
			break;
			
		case "/":
			System.out.println("osztas");
			if(masodik == 0){
				System.out.println("Nem lehet osztani 0-val!");
			}
			else {
				eredmeny = elso / masodik;
				System.out.println("Az a / b osszege: "+ eredmeny);
			}
			
			break;
			
		default: System.out.println("A negy alapmuveletet adja meg");
		}
		
		
	input.close();	
	}

}
