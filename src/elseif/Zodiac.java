package elseif;

import javax.swing.JOptionPane;

public class Zodiac {
public static void main(String[] args) {
	
	String zodiacKiller = JOptionPane.showInputDialog("What's your Zodiac/Star sign?");
		if (zodiacKiller.equalsIgnoreCase("Aries")){
			JOptionPane.showMessageDialog(null, " ARIES:Courageous, energetic, willful, commanding, leading. Often leads "
					+ "\n when following would be best course of action." );
		}
		else if (zodiacKiller.equalsIgnoreCase("Taurus")){
			JOptionPane.showMessageDialog(null, "TAURUS:Pleasure seeking, loves control, dependable, grounded,"
					+ " \n provokes slowly, and highly sensual in nature.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Gemini")){
			JOptionPane.showMessageDialog(null, "GEMINI:Cerebral, chatty, loves learning and education,"
					+ "\n  charming, and adventurous.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Cancer")){
			JOptionPane.showMessageDialog(null, "CANCER:Emotional, group oriented, seeks security, family.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Leo")){
			JOptionPane.showMessageDialog(null, "LEO:Generous, organized, protective, beautiful.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Virgo")){
			JOptionPane.showMessageDialog(null, "VIRGO:Particular, logical, practical, sense of duty, critical.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Libra")){
			JOptionPane.showMessageDialog(null, "LIBRA:Balanced, seeks beauty, sense of justice.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Scorpio")){
			JOptionPane.showMessageDialog(null, "SCORPIO:Passionate, exacting, loves extremes,"
					+ "\n  combative, reflective.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Sagittarius")){
			JOptionPane.showMessageDialog(null, "SAGITTARIUS:Happy, absent minded, creative, adventurous.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Capricorn")){
			JOptionPane.showMessageDialog(null, "CAPRICORN:Timeless, driven, calculating, ambitious.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Aquarius")){
			JOptionPane.showMessageDialog(null, "AQUARIUS:Forward thinking, communicative, people oriented,"
					+ "\n stubborn, generous, and dedicated.");
		}
		else if (zodiacKiller.equalsIgnoreCase("Pisces")){
			JOptionPane.showMessageDialog(null, "PISCES:Likeable, energetic, passionate, sensitive.");
		}
		else {JOptionPane.showMessageDialog(null, "That's not a star sign.");
		}
	
}
}
