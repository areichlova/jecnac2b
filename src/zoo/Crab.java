package zoo;

/**
 * Crab class
 * @author someone
 * @version 1.0
 *
 */

public class Crab implements AnimalInterface {
	
	public double weight;
	public double foodConsumption;
	
	public Crab() {
		
		
		
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if(weight<=0) {
			throw new RuntimeException("Invalid value");
		}
		this.weight = weight;
	}
	
	public double foodConsumption() {
		return foodConsumption;
	}
	
	public String doSound() {
		return "*CRAB RAVE*";
	}
	
	public String whoAmI() {
		return "I am a Crab!";
	}
	
}
