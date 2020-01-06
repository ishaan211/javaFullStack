package assignment.animal;

import assignment.parent.Animal;

public class Bird extends Animal{
	private String feathers;
	private String fly;
	
	public Bird(int height, int weight, String animal_type, String blood_type, String feathers, String fly) {
		super(height, weight, animal_type, blood_type);
		this.feathers = feathers;
		this.fly = fly;
	}

	public String getFeathers() {
		return feathers;
	}

	public String getFly() {
		return fly;
	}

	@Override
	public String toString() {
		return "Bird [getFeathers()=" + getFeathers() + ", getFly()=" + getFly() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimal_type()=" + getAnimal_type() + ", getBlood_type()="
				+ getBlood_type() + "]";
	}
	
	

}
