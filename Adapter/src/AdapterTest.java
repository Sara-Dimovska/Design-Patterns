
public class AdapterTest {

	public static void main(String[] args) {
		
		Robot mRobot = new Robot();
		EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(mRobot);
		
		robotAdapter.assaignDriver("Sara");
		robotAdapter.shoot();
		robotAdapter.driveForward();
	}
}
