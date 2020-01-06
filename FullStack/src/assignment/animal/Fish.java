package assignment.animal;

import assignment.parent.Animal;

public class Fish extends Animal{
	private String live;
	private String gills;
	
	public Fish(int height, int weight, String animal_type, String blood_type, String live, String gills) {
		super(height, weight, animal_type, blood_type);
		this.live = live;
		this.gills = gills;
	}

	public String getLive() {
		return live;
	}

	public String getGills() {
		return gills;
	}

	@Override
	public String toString() {
		return "Fish [getLive()=" + getLive() + ", getGills()=" + getGills() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimal_type()=" + getAnimal_type() + ", getBlood_type()="
				+ getBlood_type() + "]";
	}
	
	

}
