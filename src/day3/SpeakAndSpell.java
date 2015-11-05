package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
			
		}
		speak("Please Spell Honorificabilitudinitatibus");

		String answer = JOptionPane.showInputDialog(null, (""));

		if(answer.equalsIgnoreCase("Honorificabilitudinitatibus"))
		{
			speak("Cheater Cheater Cheater Cheater Cheater Cheater Cheater Cheater!");
		}
		else
		{
			speak("James is a noodle and will always be a noodle. Don't try to deny it James, you know it too.");
		}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


