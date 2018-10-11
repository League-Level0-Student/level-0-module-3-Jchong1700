
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 2nd";
		String dadsBirthday = "November 11th";
		String myBirthday = "July 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birth = JOptionPane.showInputDialog("Who's birthday do you need to know?");
		// 3. Print out what the user typed
		System.out.println(birth);
		// 4. if user asked for "mom"
		if (birth.equalsIgnoreCase("mom")){
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (birth.equalsIgnoreCase("dad")){
		
		
			System.out.println(dadsBirthday);
		}	
		// 6. if user asked for your name
			else if (birth.equalsIgnoreCase("Joan")){
				System.out.println(myBirthday);
			}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else { System.out.println("Sorry idk...");
			}

	} 
}
