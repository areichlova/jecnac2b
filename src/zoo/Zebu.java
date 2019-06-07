package zoo;
/**
 * Class for the creation of zubu.
 * @author sizling
 * @version 1.0
 */
public class Zebu implements AnimalInterface {

	private double weight;
	
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		if(weight<0) {
			throw new RuntimeException("No");
		}
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Mooo";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "I am zubu";
	}
/**
 * How many hours does the zubu sleep.	
 * @return
 */

	public int sleep()
	{
		return 10;
	}
 }
