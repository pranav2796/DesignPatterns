
public abstract class EnemyShip {
	
	private String name;
	private Double damage;
	
	public String getName() {	return name;	}
	public void setName(String newName) {	name = newName;	}

	public Double getDamage() {	return damage;	}
	public void setDamage(Double newDamage) {	damage = newDamage;	}
	
	public void followHeroShip() {
		System.out.println(name + " is following the hero ship.");
	}
	
	public void displayEnemy() {
		System.out.println(name + " is on the screen.");
	}
	
	public void enemyShoot() {
		System.out.println(name + " shoots and does a damage of " + damage);
	}

}
