package zoo;
/**
 * Basic trida
 * @author Kordac
 *
 */

public class Lachtan implements AnimalInterface{
private double weight;
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "oink";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Lachtan voe!";
	}

}
