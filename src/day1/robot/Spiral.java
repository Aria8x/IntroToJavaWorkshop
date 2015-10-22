package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		


		for (int i = 0; i < 10; i++) 
		{
			Robot Endo = new Robot("batman");
			Endo.sparkle();
			Endo.penDown();
			Endo.setSpeed(10);
			
			Endo.setRandomPenColor();
			Endo.move(5*i);
			Endo.turn(360/7);
			Endo.setPenWidth(i);
			

			
			Endo.setRandomPenColor();
			Endo.move(5*i);
			Endo.turn(-360/7);
			Endo.setPenWidth(i);
		}

	}
}
