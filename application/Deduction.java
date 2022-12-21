package application;

public class Deduction {

	String description;
	float value;
	
	public Deduction(String description, float value) {
		this.description = description; 
		this.value = value;
	}

	public float getValue() {
		return this.value;
	}
}
