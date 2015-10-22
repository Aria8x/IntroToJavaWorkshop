package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot Endo = new Robot("batman");
		Endo.setSpeed(10);
		Endo.penDown();
		Endo.setRandomPenColor();
		Endo.sparkle();
		
		for (int i = 0; i < 25; i++) {
			Endo.move(354);
			Endo.turn(188);
			Endo.move(257);
			Endo.turn(-76);
			Endo.move(179);
			Endo.turn(10);
			Endo.move(234);
			Endo.turn(-57);
		}

	
		
	}
}
