package zoo;
/**
 * Zvire kapustnak ma prumernou vahu 450 kg a dela zvuk piskotu. 
 * Vetsinu Hodnot na zacatku nastavime dle prumeru.
 * Pridana vlastnost nazev.
 * @author Martin Kos
 * @version 1.1
 */
public class Kapustnak implements AnimalInterface {
	double weight=450000;// in grams
	double feed=59000;
	final  String sound="Pisk";
	final  String zvire="Kapustnak";
	String nazev;
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
		return sound;
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

	public Kapustnak(double weight, String nazev) {
		super();
		this.weight = weight;
		this.nazev = nazev;
	}

}
