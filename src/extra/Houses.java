package extra;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Random pop = new Random();

		Robot candy = new Robot();
		candy.moveTo(10, 550);
		candy.hide();
		candy.setSpeed(100);
		candy.miniaturize();
		Robot.setWindowColor(96, 96, 96);
		for (int i = 0; i < 15; i++) {

			int candyPop = pop.nextInt(300) + 100;
			int color = pop.nextInt(255);
			int color2 = pop.nextInt(255);
			int color3 = pop.nextInt(255);

			candy.setPenColor(color, color2, color3);
			candy.setPenWidth(6);
			candy.penDown();
			candy.move(candyPop);
			if (candyPop < 300) {
				candy.turn(45);
				candy.move(25 / 2);
				candy.turn(90);
				candy.move(25 / 2);
				candy.turn(45);
				candy.move(candyPop);
			} else {
				candy.turn(90);
				candy.move(25);
				candy.turn(90);
				candy.move(candyPop);
			}
			candy.setPenColor(0, 255, 0);
			candy.penUp();
			candy.move(6);
			candy.turn(-90);
			candy.move(7);
			candy.penDown();
			candy.move(15);
			candy.penUp();
			candy.move(7);
			candy.turn(-90);
			candy.move(6);
		}

	}
}
