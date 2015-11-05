package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	public static void main(String[] args) {
		
	int num1 = new Random().nextInt(4);

	System.out.println(num1);
	
	for (int i = 0; i < 5; i++) {
		
		JOptionPane.showInputDialog("Ask Me Any Question.");

		if(num1 == 0)
		{
			speak("James is a Chili Bean with a touch of ugly everywhere and Conrad is a wall.");
		}

		if(num1 == 1)
		{
			speak("James is that one piece of broccoli that nobody eats because it looks weird and Conrad is part of the Aluminati. Quickly, Get Him!.");
		}
		
		if(num1 == 2)
		{
			speak("James is that black, mushy part of a banana that gets cut off and I honestly don't know why I'm still adding Conrad to these");
		}

		if(num1 == 3)
		{
			speak("James is part of the Allumati, and don't try to run, I've got the building surrounded. Quickly, Everyone Tackle Him!");
		}
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

