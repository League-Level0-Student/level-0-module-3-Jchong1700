package elseif;

import javax.swing.JOptionPane;

public class Happiness {
	public static void main(String[] args) {
		
		String happiness = JOptionPane.showInputDialog("ARE YOU HAPPY?");
			
		
		if(happiness.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "KEEP DOING WHAT YOU'RE DOING");
			}
			else if (happiness.equalsIgnoreCase("no")) {
				String no = JOptionPane.showInputDialog("DO YOU WANT TO BE HAPPY?");
					if (no.equalsIgnoreCase("no")) {
						JOptionPane.showMessageDialog(null, "KEEP DOING WHAT YOU'RE DOING.");
					}
					
					
					else if (no.equalsIgnoreCase("yes")) {
						JOptionPane.showMessageDialog(null, "CHANGE SOMETHING.");
					}
			}
			else if (happiness.equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(null, "COWARD.");
			}
			else { 
				JOptionPane.showMessageDialog(null, "ABSOLUTES ONLY");
			}
		
		
		
		
		
	}

}
