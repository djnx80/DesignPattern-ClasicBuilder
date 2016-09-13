package my.djnx.designpatterns;

import my.djnx.designpatterns.entities.Attribs;
import my.djnx.designpatterns.entities.Enemy;
import my.djnx.designpatterns.entities.Weapon;

public class CrazyGoblinBuilder implements EnemyBuilder {

	private Enemy enemy;

	public CrazyGoblinBuilder()	{
		this.enemy = new Enemy();
	}
	
	@Override
	public void buildAttribs() {
		Attribs attribs = new Attribs();
		attribs.setName("Crazy Goblin");
		attribs.setHealth(60);
		enemy.setAttribs(attribs);
	}

	@Override
	public void buildWeapon() {
		Weapon weapon = new Weapon();
		weapon.setName("Axe");
		weapon.setDamage(18.5f);
		enemy.setWeapon(weapon);
		
	}

	@Override
	public Enemy getEnemy() {
		return enemy;
	}
	

}
