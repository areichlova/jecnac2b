package zoo;
/**
 * 
 * @author bucek
 *
 */
public class Bobr implements AnimalInterface {
private double Weigh;
private double foodConsumption;
private String doSound;

@Override
public double getWeight() {
	// TODO Auto-generated method stub
	return Weigh;
}

@Override
public void setWeight(double weight) {
	// TODO Auto-generated method stub
	if(Weigh < 0) {
		throw new RuntimeException("???");
	}
	this.Weigh = Weigh;
	}


@Override
public double foodConsumption() {
	// TODO Auto-generated method stub
	return 100;
}

@Override
public String doSound() {
	// TODO Auto-generated method stub
	return "hamm";
}

@Override
public String whoAmI() {
	// TODO Auto-generated method stub
	return "Bobr";
}

}
