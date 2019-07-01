package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	String user = JOptionPane.showInputDialog("Whats your favorite bird"); 
	JOptionPane.showMessageDialog(null, user + " is awesome");
}
}
