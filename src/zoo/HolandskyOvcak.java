/**
 * Very basic class herdershond.
 * @author PetrJun
 * @version 1.0
 */
package zoo;

public class HolandskyOvcak implements AnimalInterface{
	private double weight;
	
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWeight(double weight) {
		if(weight<0) {
			throw new RuntimeException("????");
		}
		this.weight = weight;
		
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Woof, woof";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Herdershond";
	}

}
