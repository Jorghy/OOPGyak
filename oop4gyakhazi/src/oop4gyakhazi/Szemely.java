package oop4gyakhazi;

public class Szemely {
		String name;
		String makeup;
		int weight;
		double height;
		double tti;
		
		public void Tti(int weight, double height) {
			tti = weight/(height*height);
		}
		
		public void Makeup(double tti) {
			if(tti < 18.5) {
				makeup = "sovany";
			}
			else if (tti > 25) {
				makeup = "kover";
			}
			else {
				makeup = "normal";
			}
		}

		@Override
		public String toString() {
			return name + ": " + height + ", " + weight + ", tti:" + tti + ", " + makeup;
		}
		
		
		
}
