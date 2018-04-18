package polinomok;

import matematika.Polinom;

public class LinearisPolinom implements Polinom {
	
	private double a;
	private double b;
	
	public LinearisPolinom(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		if (b < 0) {
			return "y=" + a + "x" + b;
		} else{
			return "y=" + a + "x+" + b;
		}
			
		
	}

	@Override
	public double szamol(double x) {
		return a*x+b;
	}

	@Override
	public int foka() {
		if(a==0){
			return 0;
		} else {
			return 1;
		}
	}

}
