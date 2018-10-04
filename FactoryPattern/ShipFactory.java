
public class ShipFactory {

	public EnemyShip makeShip(String shipType) {
		
		if(shipType.equals("U")) {
			return new UFOEnemyShip();
		}else if(shipType.equals("R")) {
			return new RocketEnemyShip();
		}else return null;
		
	}
}
