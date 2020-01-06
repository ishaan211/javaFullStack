package assignment.parent;

public class Animal {
	private int height;
	private int weight;
	private String animal_type;
	private String blood_type;
	
	public Animal(int height, int weight, String animal_type, String blood_type) {
		super();
		this.height = height;
		this.weight = weight;
		this.animal_type = animal_type;
		this.blood_type = blood_type;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getAnimal_type() {
		return animal_type;
	}

	public String getBlood_type() {
		return blood_type;
	}

	@Override
	public String toString() {
		return "Animal [getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimal_type()="
				+ getAnimal_type() + ", getBlood_type()=" + getBlood_type() + "]";
	}
	
	

}
