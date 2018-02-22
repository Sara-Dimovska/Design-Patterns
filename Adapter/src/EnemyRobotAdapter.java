
public class EnemyRobotAdapter {

	Robot robot;
	public EnemyRobotAdapter(Robot robot) {
		this.robot = robot;
	}
	
	public void assaignDriver(String driver) {
		robot.controlledByHuman(driver);
	}
	
	public void shoot() {
		robot.smashWithHands();
	}
	
	public void driveForward() {
		robot.stepForward();
	}
}
