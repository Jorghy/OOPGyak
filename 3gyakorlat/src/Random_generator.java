
public class Random_generator {
	public static void main(String[] args) {
		int[] tomb = new int[10];
		
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = (int) (Math.random() * 50) + 1; 
			System.out.println("Az "+(i+1)+". tomb elem: "+tomb[i]);
		}
		/*for (int i = tomb.length-1; i >= 0; i--) {
			System.out.println("Az "+(i+1)+". tomb elem: " + tomb[i]);
			
		}*/
		int legnagyobb = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if((tomb[i] > legnagyobb) && (tomb[i]%2 == 0)) {
				legnagyobb = tomb[i];
			}
		}
		System.out.println("A legnagyobb páros elem: "+legnagyobb);
		
	}

}
