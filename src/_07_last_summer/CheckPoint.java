package _07_last_summer;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;



public class CheckPoint {
public static void main(String[] args) {
	String user = JOptionPane.showInputDialog("Whats your fav color?");
	JOptionPane.showMessageDialog(null, user + " is my favorite color too");
	Robot geno = new Robot(); 
	geno.penDown();  
	geno.setSpeed(400);
	for (int i = 0; i <= 3; i++) {
		geno.turn(120); 
		geno.move(50);
	}
}
}
