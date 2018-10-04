import java.util.Scanner;

public class EnemyShipTesting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice U/R");
		String option = sc.nextLine();
		
		EnemyShip ship = null;
		
		ShipFactory factory1 = new ShipFactory();
		ship = factory1.makeShip(option);
		
		doStuff(ship);
		
		
	}

	
	public static void doStuff( EnemyShip obj) {
		
		obj.followHeroShip();
		obj.displayEnemy();
		obj.enemyShoot();
		
		
	}
}
