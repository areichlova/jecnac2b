package zoo;
/**
 * *
 * @return
 */

public class Okapi implements AnimalInterface {
	private double weight;
	
	@Override
	public double getWeight() {
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
		return 12;
	}
	@Override
	public String doSound() {
		return "aaaaaa";
	}
	
	@Override
	public String whoAmI() {
		return "Okapi";
	}
	
	public String Druh() {
		return "ziraf";
		/**
		* metoda pro urceni druhu Okapi
		*/
	}

}
