package zoo;
/*
 * Very basic class fretka
 * version 1.0.1
@author Havlos
*/
public class Fretka implements AnimalInterface{

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
			throw new RuntimeException("???");
		}
		this.weight = weight;
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
		return null;
	}
	
	

}
