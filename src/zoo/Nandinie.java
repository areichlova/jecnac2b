package zoo;
/**
 * Dokumentace: Nandinie
 * @author kostera
 *
 */
public class Nandinie implements AnimalInterface{
private double weight; 
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		if (weight<0) {
			throw new RuntimeException("vazi malo");
		}
		this.weight=weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Nandinie";
	}

	
	
	
	
	
	
	
	
}
