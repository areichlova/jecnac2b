package zoo;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Velmi z�kladn� t��da Aligator
 * P�id�na metoda playSound()
 * @author MilanBrychta
 * @version 1.1
 */

public class Aligator implements AnimalInterface{
	public double weight;
	
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		return 100;
	}

	@Override
	public String doSound() {
		this.playSound();
		return "call: this.playSound()";
	}
	 
	public void playSound() {
		try{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource("AligatorSound.mp3"));
		    Clip clip = AudioSystem.getClip();
		    clip.open(audioInputStream);
		    clip.start( );
		}
		catch(Exception ex){
			System.out.println("Visit: https://youtu.be/8sfoFq4mjfM?t=15 :"+ex+"       :         "+this.getClass().getResource("AligatorSound.mp3"));
		}
	}

	@Override
	public String whoAmI() {
		return "Jmenuje se Alig�tor AAAHHHHRRRRR!";
	}
	
}
