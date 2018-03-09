package oop4gyakhazi;

public class Szemely {
		private String name;
		private String makeup;
		private int weight;
		private double height;
		private double tti;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMakeup() {
			return makeup;
		}

		public void setMakeup(String makeup) {
			this.makeup = makeup;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getTti() {
			return tti;
		}

		public void setTti(double tti) {
			this.tti = tti;
		}

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
