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
        return "Playing audio..";
	}
	
	public void playSound() {
		new Thread(new Runnable() {
            public void run() {
                try {
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(this.getClass().getResource("AligatorSound.wav"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(inputStream);
                    clip.start();
                    Thread.sleep(clip.getMicrosecondLength());
                } catch (Exception ex) {
                    System.out.println("Visit: https://youtu.be/8sfoFq4mjfM?t=15");
                }
            }

        }).start();
	}

	@Override
	public String whoAmI() {
		return "Jmenuje se Alig�tor AAAHHHHRRRRR!";
	}
	
}
