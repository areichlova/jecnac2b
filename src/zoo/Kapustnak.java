package zoo;
/**
 * Zvire kapustnak ma prumernou vahu 450 kg a dela zvuk piskotu. 
 * Vetsinu Hodnot na zacatku nastavime dle prumeru.
 * Pridana vlastnost nazev a vek.
 * @author Martin Kos
 * @version 1.2.1
 */
public class Kapustnak implements AnimalInterface {
	double weight=450000;// in grams
	final double feed=59000;
	final  String sound="Pisk";
	final  String zvire="Kapustnak";
	String nazev;
	double age=0.0;
	@Override
	public double getWeight() {
		return this.weight;
	}
	
	@Override
	public void setWeight(double weight) {
		this.weight=weight;
	}
	@Override
	public double foodConsumption() {
		return feed;
	}
	@Override
	public String doSound() {
		return "skrrrrrrrrrrrrr";
	}
	@Override
	public String whoAmI() {
		return nazev!=null?(zvire+" s jmenem:"+nazev+"."):(zvire+" beze jmena.");
	}
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public Kapustnak(double weight, double feed, String nazev, int age) {
		super();
		this.weight = weight;
		this.nazev = nazev;
		this.age = age;
	}
	public boolean setAge(double age) {
		if(age>0) {
			this.age=age;
			return true;
		}
		return false;
	}
	public double getAge() {
		return this.age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(age);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nazev == null) ? 0 : nazev.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kapustnak other = (Kapustnak) obj;
		if (Double.doubleToLongBits(age) != Double.doubleToLongBits(other.age))
			return false;
		if (nazev == null) {
			if (other.nazev != null)
				return false;
		} else if (!nazev.equals(other.nazev))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
}
