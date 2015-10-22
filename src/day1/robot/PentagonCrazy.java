package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot Endo = new Robot("batman");

		Endo.penDown();
		Endo.setSpeed(10);
		
		int sides = 5;
		int angles = 72;

		for (int i = 0; i < 200; i++) 
		{
			Endo.sparkle();
			Endo.setRandomPenColor();
			Endo.move(i);
			Endo.turn(angles);
			Endo.turn(1);

		}

	}
	
	void echo()
	{
		System.out.println ("banana");
		System.out.println ("banana");
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}