package zoo;
/**
 * Very basic animal interface
 * @author saroch
 *
 */
public class WelshSpringerSpaniel implements AnimalInterface {
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
			throw new RuntimeException("????");
		}
	this.weight= weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "haf";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Welsh Springer Spaniel";
	}

}
