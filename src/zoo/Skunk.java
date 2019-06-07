package zoo;

/**
 * 
 * @author petrousek první verze, tøída pro vytvoøení skunka
 */
public class Skunk implements AnimalInterface {
	private double vaha;

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return vaha;
	}

	@Override
	public void setWeight(double vaha) {
		// TODO Auto-generated method stub
		if (vaha <= 0) {
			throw new RuntimeException("Váha musí být vìtší než 0");
		}
		this.vaha = vaha;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Nevím";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Skunk";
	}

}
