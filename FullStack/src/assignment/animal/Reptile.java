package assignment.animal;

import assignment.parent.Animal;

public class Reptile extends Animal{
	private String skin;
	private String backbone;
	private String eggs;

	public Reptile(int height, int weight, String animal_type, String blood_type, String skin, String backbone,
			String eggs) {
		super(height, weight, animal_type, blood_type);
		this.skin = skin;
		this.backbone = backbone;
		this.eggs = eggs;
	}

	public String getSkin() {
		return skin;
	}

	public String getBackbone() {
		return backbone;
	}

	public String getEggs() {
		return eggs;
	}

	@Override
	public String toString() {
		return "Reptile [getSkin()=" + getSkin()
				+ ", getBackbone()=" + getBackbone() + ", getEggs()=" + getEggs() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimal_type()=" + getAnimal_type() + ", getBlood_type()="
				+ getBlood_type() + "]";
	}
	
	
	

}
