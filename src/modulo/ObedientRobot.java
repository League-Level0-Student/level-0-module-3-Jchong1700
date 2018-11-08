package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {	
	static Robot cheerUp = new Robot();

public static void main(String[] args) {
	cheerUp.hide();
	String shape = JOptionPane.showInputDialog("What shape do you want? "
			+ "(Circle, Triangle, Square");
	
	String color = JOptionPane.showInputDialog("Pick a color (red,blue,green");

if(shape.equalsIgnoreCase("circle")) {
	if (color.equalsIgnoreCase("red")){
		cheerUp.setPenColor(Color.red);
		drawCircle();
	}
	else if (color.equalsIgnoreCase("blue")) {
		cheerUp.setPenColor(Color.blue);
		drawCircle();
	}
	else if (color.equalsIgnoreCase("green")) {
		cheerUp.setPenColor(Color.green);
		drawCircle();
	}
}

	 if (shape.equalsIgnoreCase("triangle")) {
		if (color.equalsIgnoreCase("red")){
			cheerUp.setPenColor(Color.red);
		}
		else if (color.equalsIgnoreCase("blue")) {
			cheerUp.setPenColor(Color.blue);
		}
		else if (color.equalsIgnoreCase("green")) {
			cheerUp.setPenColor(Color.green);
		}
		
		drawTriangle();
		}
	 if (shape.equalsIgnoreCase("square")) {
		if (color.equalsIgnoreCase("red")){
			cheerUp.setPenColor(Color.red);
		}
		else if (color.equalsIgnoreCase("blue")) {
			cheerUp.setPenColor(Color.blue);
		}
		else if (color.equalsIgnoreCase("green")) {
			cheerUp.setPenColor(Color.green);
		}
		drawSquare();
		}
}
static void drawSquare() {

	

	cheerUp.penDown();
	cheerUp.miniaturize();
	cheerUp.setSpeed(50);
	for(int i = 0; i<4; i++) {
	cheerUp.move(100);
	cheerUp.turn(90);
		}
	}
static void drawTriangle() {

	cheerUp.penDown();
	cheerUp.miniaturize();
	cheerUp.setSpeed(50);
	for (int i = 0; i < 3; i++) {
		cheerUp.turn(360/3);
		cheerUp.move(100);
		}
	}
static void drawCircle() {
	

	cheerUp.penDown();
	cheerUp.miniaturize();
	cheerUp.setSpeed(50);
	for (int i = 0; i < 36; i++) {
		cheerUp.turn(10);
		cheerUp.move(10);
	}
}

}


