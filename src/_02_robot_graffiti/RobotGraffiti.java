package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot olivia = new Robot(); 
olivia.penDown(); 
olivia.setSpeed(400); 
for (int i = 0; i <= 4; i++) {
	olivia.move(100); 
	
	olivia.turn(90); 
}


	}

}
