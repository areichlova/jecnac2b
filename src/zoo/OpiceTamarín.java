package zoo;
/**   Very basic animal type class
 * 
 * @author ColaborantJiriPlajer
 * @version 1.0
 *
 */
public class OpiceTamarín implements AnimalInterface {

	private double weight;
	
	@Override
	public double getWeight() {
		
		return weight;
	}

	@Override
	public void setWeight(double weight) {
	
	   if(weight < 0) {
	   throw new RuntimeException("Musí nìco vážit");
	}
       this.weight = weight;
}
	@Override
	public double foodConsumption() {
		
		return 75;
	}

	@Override
	public String doSound() {
	
		return "Uh uh uh ha ha ha";
	}

	@Override
	public String whoAmI() {

		return "Opice Tamarín";
	}

}
