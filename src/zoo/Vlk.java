package zoo;


/**
 * Trida pro vytvoøení vlka.
 * @author Rovný
 * @version 1.0
 */

public class Vlk implements AnimalInterface {
	public double weight;

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		  if (weight < 0) {
		    	throw new RuntimeException("??");
		    }
			this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
	  return 20;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "HAAAUUUUUUUUU";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Vlk";
	}
	public String Druh() {
		return "polární";
		/**
		 * metoda pro urèení druhu vlka
		 */
	}

}
