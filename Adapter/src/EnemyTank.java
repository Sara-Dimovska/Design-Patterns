
public class EnemyTank implements EnemyAttacker{

	@Override
	public void assaignDriver(String driver) {
		System.out.println(driver +  " is moving the tank");
		
	}

	@Override
	public void shoot() {
		System.out.println("EnemyAttacker is shooting!");
		
	}

	@Override
	public void driveForward() {
		System.out.println("EnemyAttacker is moving forward!");
		
	}

}
