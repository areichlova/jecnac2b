package zoo;
import zoo.AnimalInterface;
/**
 * Basic class about "Gronsky pes". It´s only for training purpose.
 * @author chalupsky
 * 
 * @version 1.0
 */
public class Gronskypes implements AnimalInterface {
private double weight;
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
	if(weight<0) {
		System.out.println("Zvíøe nemá váhu ?");
	}
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "haf haf";//System.out.println("haf haf");
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Grónský pes";
	}

}
