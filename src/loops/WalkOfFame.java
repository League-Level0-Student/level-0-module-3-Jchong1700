
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
int xRob = 30;
int yRob = 30;
		// 2. Make the robot draw a star shape. Hint: 144.
rob.penDown();
rob.miniaturize();
rob.setSpeed(100);
int starSize = 30;
for (int i = 0; i < 5; i++) {
rob.setX(xRob);
rob.setY(yRob);
for (int j = 0; j < 2; j++) {
xRob += 50;
yRob += 50;
}
for (int o = 0; o < 5; o++) {
	rob.move(starSize);	
	rob.turn(144);
}
starSize += 30;
	}	// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
