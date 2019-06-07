package zoo;
/**
 * Trida pro vytvoreni Yaornis
 * @author snobl
 *
 */
public class Yanornis implements AnimalInterface {
	private double weight;

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		if(weight < 0) {
			throw new RuntimeException("?");
		}
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Kra Kra";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Yanornis";
	}

}
