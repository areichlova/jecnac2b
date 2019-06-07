package zoo;

/**
 * Very basic class Emu
 * @author dolog
 * @version 1.0
 */

public class Emu implements AnimalInterface {
	private double weight;
	
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		if(weight < 0) {
			throw new RuntimeException("???");
		}
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 1337;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "yeet";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Emu";
	}

}
