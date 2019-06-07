package zoo;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 * Very basic Aligator class
 * @author MilanBrychta
 * @version 1.0
 */

public class Aligator implements AnimalInterface{
	public double weight;
	
	
	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;		
	}


	@Override
	public double foodConsumption() {
		return 0;
	}


	@Override
	public String doSound() {
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
	    	System.out.println("Go to: https://youtu.be/8sfoFq4mjfM?t=15");
	    }
	}


	@Override
	public String whoAmI() {
		return "Jmenuje se Aligátor AAAHHHHRRRRR!";
	}
}
