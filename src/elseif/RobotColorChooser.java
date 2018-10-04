//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot momo = new Robot();
		//3. Ask the user what color they would like the robot to draw
	String color = JOptionPane.showInputDialog("What color of the rainbow do you want the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equalsIgnoreCase("red")) {
	momo.setPenColor(255, 0, 0);
	}
else if (color.equalsIgnoreCase("orange")) {
	momo.setPenColor(255, 128, 0);
}
else if (color.equalsIgnoreCase("yellow")) {
	momo.setPenColor(255, 255, 0);
}
else if (color.equalsIgnoreCase("green")) {
	momo.setPenColor(0, 255, 0);
}
else if (color.equalsIgnoreCase("blue")) {
	momo.setPenColor(0, 0, 255);
}
else if (color.equalsIgnoreCase("purple")) {
	momo.setPenColor(76, 0, 153);
}
else {
	momo.setPenColor(, , );
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		momo.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		momo.miniaturize();
		momo.setSpeed(100);
		momo.penDown();
	for (int i = 0; i < 4; i++) {
			momo.move(100);
			momo.turn(90);
			
		}

	}
}
