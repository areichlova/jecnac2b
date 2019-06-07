package zoo;

/**
 * 
 * @author petrousek prvn� verze, t��da pro vytvo�en� skunka
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
			throw new RuntimeException("V�ha mus� b�t v�t�� ne� 0");
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
		return "Nev�m";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Skunk";
	}

}
