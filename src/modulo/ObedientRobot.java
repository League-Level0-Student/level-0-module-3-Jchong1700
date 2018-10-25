package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	
	Robot cheerUp = new Robot();
	
for(int i = 0; i<4; i++) {
	cheerUp.penDown();
	cheerUp.miniaturize();
	cheerUp.setSpeed(50);
	cheerUp.move(100);
	cheerUp.turn(90);
		}
	
	
	}
}
