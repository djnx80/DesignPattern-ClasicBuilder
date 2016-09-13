package my.djnx.designpatterns;

import my.djnx.designpatterns.entities.Enemy;

public interface EnemyBuilder {

	public void buildAttribs();
	
	public void buildWeapon();
	
	public Enemy getEnemy();
}
