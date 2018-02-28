public class Mertani_atlag {
	public static void main(String[] args) {
		double[] tomb = new double [10];
		double atlag = 1;
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = (Math.random() * 50) + 1;
			atlag *= tomb[i];
			System.out.println("Az "+(i+1)+". tomb elem: "+tomb[i]);
			
		}
		atlag = Math.pow(atlag, 1.0 / tomb.length); 
		System.out.println("A mertani atlag: " + atlag);
	}

}
