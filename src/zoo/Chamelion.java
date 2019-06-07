package zoo;
/**
 * trida pro vytvoreni zelvy.
 * @author junachien
 * @version 1.0
 *
 */

public class Chamelion implements AnimalInterface {
	private double weight;
	private String sound = "hmmm";
	private double food = 100;
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
		
	}

	@Override
	public double foodConsumption() {
		
		return food;
	}

	@Override
	public String doSound() {
		
		return sound;
	}

	@Override
	public String whoAmI() {
		
		return "chamelion";
	}

}
