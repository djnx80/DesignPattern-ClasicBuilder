package my.djnx.designpatterns;

import my.djnx.designpatterns.entities.Enemy;

public class EnemyDirector {
	
	private EnemyBuilder enemyBuilder;
	
	
	public EnemyDirector(EnemyBuilder enemyBuilder){
		this.enemyBuilder = enemyBuilder;
	}
	
	public void createEnemy(){
		enemyBuilder.buildAttribs();
		enemyBuilder.buildWeapon();
	}
	
	public Enemy getEnemy(){
		return this.enemyBuilder.getEnemy();
	}
	
}
