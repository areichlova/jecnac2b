package zoo;
/**
 * 
 * @author kubik
 *
 */
public class Pasovec implements AnimalInterface{
private double weight;

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight ;
	}

	@Override
	public void setWeight(double weight) {
		if(weight<0) {
			throw new RuntimeException("vazi akorat");
		}
		this.weight=weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 60;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "pisk pisk  ";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Pasovec";
	}

}

