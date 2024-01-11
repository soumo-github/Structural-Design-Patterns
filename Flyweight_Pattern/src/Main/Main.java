package Main;

import Model.IRobot;
import Model.RobotFactory;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			IRobot humanroboti = RobotFactory.createRobot("HUMANROBOT");
			humanroboti.display(i, i + 5);
		}
		
//		IRobot humanrobot2 = RobotFactory.createRobot("HUMANROBOT");
//		humanrobot2.display(2, 7);

		for(int i = 0; i < 10; i++) {			
			IRobot dogroboti = RobotFactory.createRobot("DOGROBOT");
			dogroboti.display(i - 1, i + 1);
		}
		
//		IRobot dogrobot2 = RobotFactory.createRobot("DOGROBOT");
//		dogrobot2.display(8, 9);
		
		
	}

}
