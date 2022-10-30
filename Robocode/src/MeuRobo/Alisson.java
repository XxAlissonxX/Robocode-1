package MeuRobo;

import java.awt.Color;

public class Alisson extends AdvancedRobot{
	
	public void run() {
		setColors(Color.black, Color.red, Color.black);

		while (true) {
			ahead(200);
			turnLeft(45);
			turnGunLeft(360);

		}
	}
	public void onScannedRobot(ScannedRobotEvent e) {
		
		String nome = e.getName();
		double distancia = e.getDistance();
		
		if(distancia<140) {
			fire(3);
		}else {
			fire(2);
		}
		
	}
	public void onHitWall(HitWallEvent event) {
		turnLeft(90);
	}
	
	public void onHitByBullet(HitByBulletEvent envent) {
		ahead(200);
		turnLeft(45);
	}
	
	public void onHitRobot(HitRobotEvent event) {
		turnLeft(90);
	}
}
