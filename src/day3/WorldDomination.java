package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String answer;
		
		for (int i = 0; i < 3; i++) {
		
			answer = JOptionPane.showInputDialog("Do you know how to write code?");

			if(answer.equalsIgnoreCase("Yes"))
			{
				JOptionPane.showMessageDialog(null, "Good job. That's it. I mean, you can't rule the world if you just know code. Don't get over your head bud. You'll still have to get a job and all that. Soooooo... Have a nice life.");
			}
			else if(answer.equalsIgnoreCase("No"))
			{
				JOptionPane.showMessageDialog(null, "Welp, you kind of suck. Doesn't really change anything though. I mean, a lot of people don't know how to code. Your just another normal person. Don't feel bad though..");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "I have no idea what you just said, Soooooo...");
			}
		}
	}
}

