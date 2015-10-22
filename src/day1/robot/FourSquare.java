package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot Endo = new Robot("batman");

	void go() {
		Endo.setSpeed(10);
		Endo.setPenWidth(5);
		
		for (int i = 0; i < 20; i++) 
		{
			Endo.hide();
			Endo.setRandomPenColor();			
			drawSquare();
			Endo.turn(-90);
	
		}
	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "James is a banana.");
		
		for (int i = 0; i < 30; i++) 
		{
			Endo.penDown();
			Endo.move(275);
			Endo.turn(183);
			Endo.move(275);
			Endo.turn(-183);
			Endo.move(275);
			Endo.turn(183);
			Endo.move(275);
			Endo.turn(-183);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
