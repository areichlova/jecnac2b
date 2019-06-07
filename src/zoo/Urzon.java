package zoo;

/**
 * Trida pro reprezentaci Urzona
 * 
 * @author LesbiOtravnejLoliTrpaslik
 * @version 1.0
 */
public class Urzon implements AnimalInterface {
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
		return 450;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "hhh";
	}

	@Override
	public String whoAmI() {
		return "Urzon Kanadský";
	}

}
