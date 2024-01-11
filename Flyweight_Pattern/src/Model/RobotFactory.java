package Model;

import java.util.HashMap;

public class RobotFactory {
	
	private static HashMap<String, IRobot> robotobj = new HashMap<>();
	
	
	public static IRobot createRobot(String robotType) {
		if(robotobj.containsKey(robotType)) {
			return robotobj.get(robotType);
		}
		else {
			if(robotType == "HUMANROBOT") {
				Sprites humanSprite = new Sprites();
				IRobot humanobj = new HumanRobot(robotType, humanSprite);
				robotobj.put(robotType, humanobj);
				System.out.println("Human Robot Created");
				return humanobj;
			}
			else if(robotType == "DOGROBOT") {
				Sprites dogSprite = new Sprites();
				IRobot dogobj = new DogRobot(robotType, dogSprite);
				robotobj.put(robotType, dogobj);
				System.out.println("Dog Robot Created");
				return dogobj;
			}
		}
		return null;
	}
}
